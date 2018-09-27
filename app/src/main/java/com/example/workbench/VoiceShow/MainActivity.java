package com.example.workbench.VoiceShow;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private String          mPhoneNumber;                           // 핸드폰 번호 문자열

    private void initialize()
    {
        mPhoneNumber        = "";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(com.example.workbench.VoiceShow.R.layout.activity_main);

        initialize();
       // startActivity(new Intent("android.intent.action.DIAL"));
    }


    @Override
    // activiy_main 에서 발생되는 버튼 이벤트 처리.
    public void onClick(View v)
    {
        // 핸드폰 번호를 보여 줄 텍스트뷰 아이디
        TextView        tv_PhoneNum = (TextView)findViewById(R.id.TEXT_PHONE_NUM);

        switch(v.getId())
        {
            case R.id.BACK_SPACE:
                // 핸드폰번호 뒤에서 하나씩 지움.
                //int         len = mPhoneNumber.length();
                //mPhoneNumber.substring()
                break;

            case R.id.KEYPAD_0:
                mPhoneNumber    += "0";
                break;
            case R.id.KEYPAD_1:
                mPhoneNumber    += "1";
                break;
            case R.id.KEYPAD_2:
                mPhoneNumber    += "2";
                break;
            case R.id.KEYPAD_3:
                mPhoneNumber    += "3";
                break;
            case R.id.KEYPAD_4:
                mPhoneNumber    += "4";
                break;
            case R.id.KEYPAD_5:
                mPhoneNumber    += "5";
                break;
            case R.id.KEYPAD_6:
                mPhoneNumber    += "6";
                break;
            case R.id.KEYPAD_7:
                mPhoneNumber    += "7";
                break;
            case R.id.KEYPAD_8:
                mPhoneNumber    += "8";
                break;
            case R.id.KEYPAD_9:
                mPhoneNumber    += "9";
                break;

            case R.id.KEYPAD_STAR:
                mPhoneNumber    += "*";
                break;
            case R.id.KEYPAD_SHAP:
                mPhoneNumber    += "#";
                break;

            case R.id.KEYPAD_VCALL:
                // 영상 통화
                break;
            case R.id.KEYPAD_CALL:
                // 음성 통화
                break;
            case R.id.KEYPAD_HIDE:
                // 키 패드 활성/비활성
                break;
        }

        // 영상/음성 통화, 키패드 활성/비활성 버튼이 아닌 경우 텍스트뷰에 핸드폰 번호 갱신.
        if (v.getId() != R.id.KEYPAD_CALL && v.getId() != R.id.KEYPAD_VCALL && v.getId() != R.id.KEYPAD_HIDE)
            tv_PhoneNum.setText(mPhoneNumber);
    }
}