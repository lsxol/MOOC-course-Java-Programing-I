
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkazmierczak
 */
public class MessagingService {
    
    private ArrayList<Message> service;

    public MessagingService() {
        this.service = new ArrayList();
    }
    public void add(Message message){
        if(message.getContent().length()<281){
            this.service.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        return this.service;
    }
    
    
    
}
