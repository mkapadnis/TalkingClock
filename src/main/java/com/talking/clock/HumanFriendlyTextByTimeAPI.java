package com.talking.clock;

import com.talking.clock.exception.InvalidInputException;
import com.talking.clock.util.TimeUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HumanFriendlyTextByCurrentTime")
public class HumanFriendlyTextByTimeAPI {

    @GetMapping(value="/time",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getHumanFriendlyTextByTimeAPI(@RequestParam String time){
        String timeArray[] = time.split(":");
        int h = Integer.parseInt(timeArray[0]);
        int m = Integer.parseInt(timeArray[1]);
        String humanFriendText = null;
        try {
            humanFriendText = TimeUtil.timeString(h, m);
        } catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(humanFriendText, HttpStatus.OK);
    }
}
