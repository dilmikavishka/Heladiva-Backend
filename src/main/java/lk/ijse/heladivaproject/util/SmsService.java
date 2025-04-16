package lk.ijse.heladivaproject.util;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



@Service
public class SmsService {

    @Value("${twilio.phone.number}")
    private String fromPhoneNumber;

    public String sendOrderConfirmation(String phoneNumber, String orderId, Double totalPrice, String productDetails) {
        String smsBody = "🛍️ Order Confirmed!\n"
                + "Order ID: " + orderId + "\n"
                + "Items:\n"
                + productDetails + "\n"
                + "Total: LKR " + totalPrice + "\n"
                + "Track: Hela Diva" + orderId;

        try {
            Message message = Message.creator(
                    new PhoneNumber(phoneNumber),
                    new PhoneNumber(fromPhoneNumber),
                    smsBody
            ).create();
            return "SMS Sent Successfully! SID: " + message.getSid();
        } catch (Exception e) {
            return "Error Sending SMS: " + e.getMessage();
        }
    }
}

