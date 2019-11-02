package com.example.dbmanalyser;


import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.widget.ImageView;
import android.widget.TextView;

public class StnPhoneStateListener extends PhoneStateListener {
    int strength;
    TextView signalStrengthView;
    ImageView imageView;


    StnPhoneStateListener(TextView view, ImageView img) {
        signalStrengthView = view;
        imageView = img;
    }

    @Override
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        strength = signalStrength.getGsmSignalStrength();
        strength = (2 * strength) - 113; // -> dBm

        if (strength > 0){
            imageView.setImageResource(R.drawable.sinal00);
            signalStrengthView.setText("Sem Sinal");
        } else if(strength >=-70){
            imageView.setImageResource(R.drawable.sinal05);
            signalStrengthView.setText("Potência do sinal: " + Integer.toString(strength) + " dBm");
        } else if(strength >=-80){
            imageView.setImageResource(R.drawable.sinal04);
            signalStrengthView.setText("Potência do sinal: " + Integer.toString(strength) + " dBm");
        } else if(strength >=-90) {
            imageView.setImageResource(R.drawable.sinal03);
            signalStrengthView.setText("Potência do sinal: " + Integer.toString(strength) + " dBm");
        }else if(strength >=-100) {
            imageView.setImageResource(R.drawable.sinal01);
            signalStrengthView.setText("Potência do sinal: " + Integer.toString(strength) + " dBm");
        }else {
            imageView.setImageResource(R.drawable.sinal00);
            signalStrengthView.setText("Potência do sinal: " + Integer.toString(strength) + " dBm");
        }

    }
}
