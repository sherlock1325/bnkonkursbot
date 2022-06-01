package Controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.LinkedList;

public class CodeMessage {

    public CodeMessage type;
    private SendMessage sendMessage;
    private EditMessageText editMessageText;
    private String loginUrl;
    public LinkedList list;

    public LinkedList getList() {
        return list;
    }

    public void setList(LinkedList list) {
        this.list = list;
    }


    public SendMessage getSendMessage() {
        return sendMessage;
    }

    public EditMessageText getEditMessageText() {
        return editMessageText;
    }

    public void setSendMessage(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void setEditMessageText(EditMessageText editMessageText) {
        this.editMessageText = editMessageText;
    }

}
