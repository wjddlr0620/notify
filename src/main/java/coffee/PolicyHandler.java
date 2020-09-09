package coffee;

import coffee.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @Autowired
    private NotifyRepository notifyRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMade_Notify(@Payload Made made){

        if(made.isMe()){
            System.out.println("##### listener Notify : " + made.toJson());

            SimpleDateFormat format = new SimpleDateFormat ( "yyyyMMdd HHmmss");
            Date today = new Date();
            String time = format.format(today);

            List<Notify> notifyList = notifyRepository.findByRequestId(made.getRequestId());
            for( Notify notify : notifyList) {

                notify.setNotifyTime(time);
                notify.setStatus("Notified");
                notifyRepository.save(notify);  
            }                
        }
    }

}
