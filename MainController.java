package Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.awt.Desktop.Action.EDIT;


public class MainController extends TelegramLongPollingBot {
    private GeneralController generalController;

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @Override
    public String getBotUsername() {
        return "BN_konkursbot";
    }

    @Override
    public String getBotToken() {
        return "5378116801:AAF1WercYKjYCLlRsY5lVlIz_i9Y2skw12I";
    }

    public MainController() {
        this.generalController = new GeneralController();
    }

    LinkedList list = new LinkedList();

    public void myMethod(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        Integer messageId = message.getMessageId();
        User user = message.getFrom();
        for (int i = 0; i <= 1000; i++) {
            for (int j = 1; j <= 1001; j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(i);
                }
            }
        }
    }

    @Override
    public void onUpdateReceived(Update update) {

        Message message = update.getMessage();

        if (update.hasCallbackQuery()) {

            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            User user2 = callbackQuery.getFrom();
            Message message2 = callbackQuery.getMessage();

            if (data.equals("tekshirish") || data.equals("tekshir")) {
                this.sendMg(this.generalController.handle(data, message2.getChatId(), message2.getMessageId(), user2));
            } else if (data.equals("tekshirish2") || data.equals("tekshir2")) {
                this.sendMsg(this.generalController.handle(data, message2.getChatId(), message2.getMessageId(), user2));
            }

        } else if (message.hasContact()) {
            String text = message.getText();
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId().toString());
            User user = message.getFrom();
            sendMessage.setText("*Hurmatli obunachi *" + user.getFirstName() + " * Adminlarimiz siz bilan bog`lanishadi va homiy bo`lish shartlarini tushuntirishadi!!*");
            sendMessage.setParseMode("Markdown");

            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboardRowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardButton menu = new KeyboardButton();
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setInputFieldPlaceholder(text);
            menu.setText("Menu\uD83D\uDCC2");
            row1.add(menu);
            keyboardRowList.add(row1);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);


            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else if (message != null) {

            String text = message.getText();
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId().toString());
            Integer messageId = message.getMessageId();
            User user3 = message.getFrom();

            if (text != null) {
                if (text.equals("/start") || text.equals("/settings") || text.equals("/help") ||
                        text.equals("Menu\uD83D\uDCC2") || text.equals("\uD83C\uDFAB Bilet olish") || text.equals("\uD83D\uDCCA Statistika")
                        || text.equals("\uD83D\uDCDA Homiy kanallar") || text.equals("\uD83D\uDCD6 O'yin haqida") || text.equals("➕ Homiy bo'lish")
                        || text.equals("\uD83C\uDFB2 Random") || text.equals("Parol12*#") || text.equals("Winner\uD83E\uDD47")) {
                    this.sendMsg(this.generalController.handle(text, message.getChatId(), message.getMessageId(), user3));
                }

//
            }

        }

    }


    public void sendMsg(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(CodeMessage codeMessage) {
        try {

            execute(codeMessage.getSendMessage());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMg(CodeMessage codeMessage) {
        try {

            execute(codeMessage.getEditMessageText());

        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}