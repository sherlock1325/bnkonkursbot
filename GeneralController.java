package Controller;

import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButtonPollType;
import org.aopalliance.reflect.Code;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import javax.validation.groups.Default;
import java.util.*;

import static java.awt.Color.red;
import static java.awt.Desktop.Action.EDIT;
import static java.awt.SystemColor.menu;


public class GeneralController {
    int counter = 0;
    LinkedList list = new LinkedList();

    LinkedList list2 = new LinkedList();

    public CodeMessage handle(String text, Long chatId, Integer messageId, User user) {
        CodeMessage codeMessage = new CodeMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(chatId));
        codeMessage.setSendMessage(sendMessage);

        if (text.equals("/start")) {

            sendMessage.setText("*Assalomu alaykum. @BN_konkursbot botiga xush kelibsiz!!!\n" +
                    "Botdan foydalanish uchun kanalimizga aʼzo boʻling✅*");
            sendMessage.setParseMode("Markdown");
            InlineKeyboardButton button1 = new InlineKeyboardButton();
            InlineKeyboardButton button2 = new InlineKeyboardButton();
            button1.setText("Moviy tuyg‘ular..\uD83D\uDC99");
            button1.setUrl("https://t.me/moviy_tuygular");
            button2.setText("Tekshirish");
            button2.setCallbackData("tekshirish");


            List<InlineKeyboardButton> rowInline = new ArrayList<>();
            rowInline.add(button1);
            rowInline.add(button2);
            List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
            rowsInline.add(rowInline);
            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
            markupInline.setKeyboard(rowsInline);
            sendMessage.setReplyMarkup(markupInline);
            codeMessage.setSendMessage(sendMessage);


        } else if (text.equals("/help")) {
            sendMessage.setText("/help bosildi");
            codeMessage.setSendMessage(sendMessage);
        } else if (text.equals("\uD83C\uDFAB Bilet olish")) {

            sendMessage.setText("*Bilet olish uchun bizning homiy kanallarimizga ulaning va Tekshirish✅ tugmasini bosing " +
                    "\n" +
                    "Bizning homiy kanallarimiz\uD83D\uDCB5* ");

            sendMessage.setParseMode("Markdown");
            InlineKeyboardButton button1 = new InlineKeyboardButton();
            InlineKeyboardButton button2 = new InlineKeyboardButton();
            InlineKeyboardButton button3 = new InlineKeyboardButton();
            InlineKeyboardButton button4 = new InlineKeyboardButton();
            button1.setText("\uD83D\uDC5BDengiznur shopping\uD83D\uDECD");
            button2.setText("\"BN\" books \uD83E\uDD51");
            button3.setText("BN_brend_shop");
            button4.setText("Tekshirish✅");
            button4.setCallbackData("tekshir");
            button1.setUrl("https://t.me/Dengiznur_shopping");
            button2.setUrl("https://t.me/BN_bookss");
            button3.setUrl("https://t.me/BN_brend_shop");

            List<InlineKeyboardButton> rowInline = new ArrayList<>();
            List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
            List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
            List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
            rowInline.add(button1);
            rowInline2.add(button2);
            rowInline3.add(button3);
            rowInline4.add(button4);
            List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
            rowsInline.add(rowInline);
            rowsInline.add(rowInline2);
            rowsInline.add(rowInline3);
            rowsInline.add(rowInline4);
            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
            markupInline.setKeyboard(rowsInline);
            sendMessage.setReplyMarkup(markupInline);
            codeMessage.setSendMessage(sendMessage);


        } else if (text.equals("tekshir")) {

            EditMessageText editMessageText = new EditMessageText();
            editMessageText.setText("*Barcha kanallarga obuna bo`lganligingizni qayta tekshiring va Tekshirish✅ tugmasini bosing " + " \n Bizning homiy kanallarimiz\uD83D\uDCB5* ");
            editMessageText.setParseMode("Markdown");
            InlineKeyboardButton button1 = new InlineKeyboardButton();
            InlineKeyboardButton button2 = new InlineKeyboardButton();
            InlineKeyboardButton button3 = new InlineKeyboardButton();
            InlineKeyboardButton button4 = new InlineKeyboardButton();
            button1.setText("\uD83D\uDC5BDengiznur shopping\uD83D\uDECD");
            button2.setText("\"BN\" books \uD83E\uDD51");
            button3.setText("BN_brend_shop");
            button4.setText("Tekshirish");
            button4.setCallbackData("tekshir2");
            button1.setUrl("https://t.me/Dengiznur_shopping");
            button2.setUrl("https://t.me/BN_bookss");
            button3.setUrl("https://t.me/BN_brend_shop");

            List<InlineKeyboardButton> rowInline = new ArrayList<>();
            List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
            List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
            List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
            rowInline.add(button1);
            rowInline2.add(button2);
            rowInline3.add(button3);
            rowInline4.add(button4);
            List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
            rowsInline.add(rowInline);
            rowsInline.add(rowInline2);
            rowsInline.add(rowInline3);
            rowsInline.add(rowInline4);
            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
            markupInline.setKeyboard(rowsInline);
            editMessageText.setReplyMarkup(markupInline);
            editMessageText.setChatId(chatId.toString());
            editMessageText.setMessageId(messageId);
            editMessageText.setParseMode("Markdown");
            codeMessage.setEditMessageText(editMessageText);

        } else if (text.equals("tekshir2")) {


            if (list.contains(user.getId()) == false) {
                counter += 1;
                list.add(user.getId());
                list2.add(user.getFirstName());

            }
            sendMessage.setText("*Sizning bilet raqamingiz: *" + (list.indexOf(user.getId()) + 1));


            sendMessage.setChatId(chatId.toString());
            sendMessage.setParseMode("Markdown");
            codeMessage.setSendMessage(sendMessage);
            System.out.println(list);
        } else if (text.equals("/settings")) {
            sendMessage.setText("/settings bosildi");
            codeMessage.setSendMessage(sendMessage);
        } else if (text.equals("Menu\uD83D\uDCC2")) {

            sendMessage.setText("*Menu bo`limi* ");
            sendMessage.setParseMode("Markdown");
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboardRowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardButton ticket = new KeyboardButton();
            KeyboardButton sponsors = new KeyboardButton();
            KeyboardButton statistics = new KeyboardButton();
            KeyboardButton about = new KeyboardButton();
            KeyboardButton beSponsor = new KeyboardButton();
            KeyboardButton random = new KeyboardButton();
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setInputFieldPlaceholder(text);
            ticket.setText("\uD83C\uDFAB Bilet olish");
            sponsors.setText("\uD83D\uDCDA Homiy kanallar");
            statistics.setText("\uD83D\uDCCA Statistika");
            about.setText("\uD83D\uDCD6 O'yin haqida");
            beSponsor.setText("➕ Homiy bo'lish");
            random.setText("\uD83C\uDFB2 Random");
            row1.add(ticket);
            row1.add(sponsors);
            row2.add(statistics);
            row2.add(about);
            row3.add(beSponsor);
            row3.add(random);
            keyboardRowList.add(row1);
            keyboardRowList.add(row2);
            keyboardRowList.add(row3);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            codeMessage.setSendMessage(sendMessage);


        } else if (text.equals("➕ Homiy bo'lish")) {
            SendMessage sendMessage1 = new SendMessage();
            KeyboardButton button1 = new KeyboardButton();

            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboardRowList = new ArrayList<>();
            KeyboardRow row = new KeyboardRow();
            row.add(button1);
            keyboardRowList.add(row);

            button1.setRequestContact(true);

            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            sendMessage1.setReplyMarkup(replyKeyboardMarkup);
            sendMessage1.setText("*Telefon raqamingizni  yuboring* ");
            button1.setText("Contact\uD83D\uDCF2");

            sendMessage1.setChatId(chatId.toString());
            sendMessage1.setParseMode("Markdown");
            codeMessage.setSendMessage(sendMessage1);

        } else if (text.equals("\uD83D\uDCDA Homiy kanallar")) {
            sendMessage.setText("*Bizning homiy kanallarimiz\uD83D\uDCB5* ");
            sendMessage.setParseMode("Markdown");
            InlineKeyboardButton button1 = new InlineKeyboardButton();
            InlineKeyboardButton button2 = new InlineKeyboardButton();
            InlineKeyboardButton button3 = new InlineKeyboardButton();
            button1.setText("\uD83D\uDC5BDengiznur shopping\uD83D\uDECD");
            button2.setText("\"BN\" books \uD83E\uDD51");
            button3.setText("BN_brend_shop");
            button1.setUrl("https://t.me/Dengiznur_shopping");
            button2.setUrl("https://t.me/BN_bookss");
            button3.setUrl("https://t.me/BN_brend_shop");
            List<InlineKeyboardButton> rowInline = new ArrayList<>();
            List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
            List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
            rowInline.add(button1);
            rowInline2.add(button2);
            rowInline3.add(button3);
            List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
            rowsInline.add(rowInline);
            rowsInline.add(rowInline2);
            rowsInline.add(rowInline3);
            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
            markupInline.setKeyboard(rowsInline);
            sendMessage.setReplyMarkup(markupInline);
            codeMessage.setSendMessage(sendMessage);


        } else if (text.equals("\uD83C\uDFB2 Random")) {

            sendMessage.setText("*Bu tugma faqat adminlar uchun ishlab chiqilgan. Agar adminlardan biri bo`lsangiz parolni kiriting!*");
            sendMessage.setParseMode("Markdown");
            codeMessage.setSendMessage(sendMessage);

        } else if (text.equals("\uD83D\uDCD6 O'yin haqida")) {
            sendMessage.setText("*Oʻyin haqida maʼlumot olish uchun\n" +
                    "@shopping_me1 ga yozing✅*");
            sendMessage.setParseMode("Markdown");
            codeMessage.setSendMessage(sendMessage);

        } else if (text.equals("\uD83D\uDCCA Statistika")) {
            SendMessage sendMessage1 = new SendMessage();

            sendMessage1.setText("*\uD83D\uDCCA Statistika:\n*" +
                    "*\uD83D\uDCB8 Homiy kanallar soni : 3\n*" +
                    "*\uD83D\uDCB3 Berilgan biletlar soni :  *" + counter);
            sendMessage1.setChatId(chatId.toString());
            sendMessage1.setParseMode("Markdown");
            codeMessage.setSendMessage(sendMessage1);


        } else if (text.equals("tekshirish")) {

            EditMessageText editMessageText = new EditMessageText();

            editMessageText.setText("*Hurmatli foydalanuvchi kanalimizga ulanganligingizni tekshirib ko`ring!!!* ");
            InlineKeyboardButton button3 = new InlineKeyboardButton();
            InlineKeyboardButton button4 = new InlineKeyboardButton();
            button4.setText("Tekshirish");
            button4.setCallbackData("tekshirish2");
            button3.setText("Moviy tuyg‘ular..\uD83D\uDC99");
            button3.setUrl("https://t.me/moviy_tuygular");
            List<InlineKeyboardButton> rowInline = new ArrayList<>();
            rowInline.add(button3);
            rowInline.add(button4);
            List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
            rowsInline.add(rowInline);
            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
            markupInline.setKeyboard(rowsInline);
            editMessageText.setReplyMarkup(markupInline);
            editMessageText.setChatId(chatId.toString());
            editMessageText.setMessageId(messageId);
            editMessageText.setParseMode("Markdown");
            codeMessage.setEditMessageText(editMessageText);


        } else if (text.equals("tekshirish2")) {
            SendMessage sendMessage1 = new SendMessage();
            sendMessage1.setText("*Thanks for subscribe* ");
            sendMessage1.setChatId(chatId.toString());
            sendMessage1.setParseMode("Markdown");
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
            sendMessage1.setReplyMarkup(replyKeyboardMarkup);
            codeMessage.setSendMessage(sendMessage1);

        } else if (text.equals("Winner\uD83E\uDD47")) {


            sendMessage.setParseMode("Markdown");

            codeMessage.setSendMessage(sendMessage);
            Random rand = new Random();
            int minRange = 0, maxRange = list.size() + 1;
            int value = rand.nextInt(maxRange - minRange) + minRange;
            sendMessage.setText("*G`olib ishtirokchi id raqami - *" + list.get(value) + "          " +
                    "*G`olib ishtirokchi ismi - *" + list2.get(value));

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


        } else if (text.equals("Parol12*#")) {
            sendMessage.setText("*G`olibni aniqlash uchun tugmani bosing!*");
            sendMessage.setParseMode("Markdown");

            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboardRowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardButton winner = new KeyboardButton();
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setInputFieldPlaceholder(text);
            winner.setText("Winner\uD83E\uDD47");
            row1.add(winner);
            keyboardRowList.add(row1);
            replyKeyboardMarkup.setKeyboard(keyboardRowList);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);
            codeMessage.setSendMessage(sendMessage);

        } else {
            sendMessage.setText("*Nomalum xabar!!!*");
            sendMessage.setParseMode("Markdown");
            codeMessage.setSendMessage(sendMessage);
        }


        return codeMessage;

//
    }


}

