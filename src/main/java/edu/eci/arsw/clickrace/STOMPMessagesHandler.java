/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.clickrace;

import edu.eci.arsw.clickrace.model.RaceParticipant;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 *
 * @author 2108746
 */

@Controller
public class STOMPMessagesHandler {
    
    @Autowired
    SimpMessagingTemplate msgt;
    ConcurrentHashMap<Integer, Set<RaceParticipant>> participants=new ConcurrentHashMap<>();
    
    @MessageMapping("/races/{racenum}/winner")
    public void winnerEvent( @DestinationVariable String racenum){
        
    }
    
}
