//package org.telegram.messenger.voip;
//
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallConfig;
//import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallFragment;
//import com.zegocloud.uikit.prebuilt.call.invite.widget.ZegoSendCallInvitationButton;
//import com.zegocloud.uikit.service.defines.ZegoUIKitUser;
//
//import org.telegram.messenger.R;
//
//import java.util.Collections;
//
//public class ZegoCallActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.zegocall);
////        System.out.println("MAHMOUUDDD_call_start_out_func");
//
//
////        ZegoSendCallInvitationButton button = new ZegoSendCallInvitationButton(this);
////        //	If true, a video call is made when the button is pressed. Otherwise, a voice call is made.
////        button.setIsVideoCall(true);
////        //resourceID can be used to specify the ringtone of an offline call invitation, which must be set to the same value as the Push Resource ID in ZEGOCLOUD Admin Console. This only takes effect when the notifyWhenAppRunningInBackgroundOrQuit is true.
////        button.setResourceID("zego_uikit_call");
////        button.setInvitees(Collections.singletonList(new ZegoUIKitUser("136907725")));
//        addCallFragment();
//
//    }
//
//    public void addCallFragment() {
//
//        System.out.println("MAHMOUUDDD_call_start_func");
//
//        long appID = 654464311;
//        String appSign = "a087a0b9a7d4169da49300c6c699936a3e9f45b0d4ef97aebf7a220403fe6519";
//
//        String callID = "testttt";
//        String userID = "136907725";
//        String userName = "MA7AMI7O";
//
//        // You can also use GroupVideo/GroupVoice/OneOnOneVoice to make more types of calls.
//        ZegoUIKitPrebuiltCallConfig config = ZegoUIKitPrebuiltCallConfig.oneOnOneVideoCall();
//
//        ZegoUIKitPrebuiltCallFragment fragment = ZegoUIKitPrebuiltCallFragment.newInstance(
//                appID, appSign, callID, userID, userName,config);
//
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.fragment_container, fragment)
//                .commitNow();
//
//        System.out.println("MAHMOUUDDD_call_end_func");
//
//    }
//}
//
