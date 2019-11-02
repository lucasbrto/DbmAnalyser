package com.example.dbmanalyser;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TelephonyManager telephonyManager;
    StnPhoneStateListener psListener;
    TextView signalStrengthView;
    TextView operadora;
    TextView tipo;
    TextView banda;
    TextView code;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            try {

                //Alteração git
                    // set up cell monitoring
                    signalStrengthView = findViewById(R.id.signalStrengthView);
                    imageView =  findViewById(R.id.imageView);

                    psListener = new StnPhoneStateListener(signalStrengthView, imageView);
                    telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
                    telephonyManager.listen(psListener, PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);

                    operadora = findViewById(R.id.txtOperadora);
                    operadora.setText(telephonyManager.getSimOperatorName());

                    code = findViewById(R.id.codeXML);
                    String codigoderede = telephonyManager.getSimOperator();
                    code.setText(codigoderede);

                    banda = (TextView) findViewById(R.id.txtBand);
                    tipo = (TextView) findViewById(R.id.txtType);
                    int networkType = telephonyManager.getNetworkType();
                    switch (networkType) {
                        case 7:
                            tipo.setText("2.5G(CDMA2000)");
                            banda.setText("800 - 850 MHz");
                            break;
                        case 4:
                            tipo.setText("3G(CDMA)");
                            banda.setText("2100 MHz");
                            break;
                        case 2:
                            tipo.setText("2.5(EDGE)");
                            banda.setText("850 MHz");
                            break;
                        case 14:
                            tipo.setText("3.5G(eHRPD)");
                            banda.setText("2100 MHz");
                            break;
                        case 5:
                            tipo.setText("3G(EVDO)");
                            banda.setText("2100 MHz");
                            break;
                        case 6:
                            tipo.setText("3G(EVDO)");
                            banda.setText("2100 MHz");
                            break;
                        case 12:
                            tipo.setText("3G(EVDO)");
                            banda.setText("2100 MHz");
                            break;
                        case 1:
                            tipo.setText("2G(GPRS)");
                            banda.setText("850 MHz");
                            break;
                        case 8:
                            tipo.setText("3G(HSDPA)");
                            banda.setText("2100 MHz");
                            break;
                        case 10:
                            tipo.setText("3G(HSPA)");
                            banda.setText("2100 MHz");
                            break;
                        case 15:
                            tipo.setText("3G(HSPA+)");
                            banda.setText("2100 MHz");
                            break;
                        case 9:
                            tipo.setText("3G(HSUPA)");
                            banda.setText("2100 MHz");
                            break;
                        case 11:
                            tipo.setText("Rádio(iDen)");
                            banda.setText("800 MHz");
                            break;
                        case 13:
                            tipo.setText("4G(LTE)");
                            banda.setText("700 MHz");
                            break;
                        case 3:
                            tipo.setText("3G(UMTS)");
                            banda.setText("2100 MHz");
                            break;
                        case 16:
                            tipo.setText("3G(GSM)");
                            banda.setText("");
                            break;
                        case 20:
                            tipo.setText("5G(NR)");
                            banda.setText("Banda desconhecida");
                        case 0:
                            tipo.setText("Sem internet");
                            banda.setText("-");
                            break;
                    }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            button = findViewById(R.id.button2);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        // set up cell monitoring
                        signalStrengthView = (TextView) findViewById(R.id.signalStrengthView);
                        imageView = (ImageView) findViewById(R.id.imageView);

                        psListener = new StnPhoneStateListener(signalStrengthView, imageView);
                        telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
                        telephonyManager.listen(psListener, PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);

                        operadora = (TextView) findViewById(R.id.txtOperadora);
                        operadora.setText(telephonyManager.getSimOperatorName());

                        banda = (TextView) findViewById(R.id.txtBand);
                        tipo = (TextView) findViewById(R.id.txtType);
                        int networkType = telephonyManager.getNetworkType();
                        switch (networkType) {
                            case 7:
                                tipo.setText("2.5G(CDMA2000)");
                                banda.setText("800 - 850 MHz");
                                break;
                            case 4:
                                tipo.setText("3G(CDMA)");
                                banda.setText("2100 MHz");
                                break;
                            case 2:
                                tipo.setText("2.5(EDGE)");
                                banda.setText("850 MHz");
                                break;
                            case 14:
                                tipo.setText("3.5G(eHRPD)");
                                banda.setText("2100 MHz");
                                break;
                            case 5:
                                tipo.setText("3G(EVDO)");
                                banda.setText("2100 MHz");
                                break;
                            case 6:
                                tipo.setText("3G(EVDO)");
                                banda.setText("2100 MHz");
                                break;
                            case 12:
                                tipo.setText("3G(EVDO)");
                                banda.setText("2100 MHz");
                                break;
                            case 1:
                                tipo.setText("2G(GPRS)");
                                banda.setText("850 MHz");
                                break;
                            case 8:
                                tipo.setText("3G(HSDPA)");
                                banda.setText("2100 MHz");
                                break;
                            case 10:
                                tipo.setText("3G(HSPA)");
                                banda.setText("2100 MHz");
                                break;
                            case 15:
                                tipo.setText("3G(HSPA+)");
                                banda.setText("2100 MHz");
                                break;
                            case 9:
                                tipo.setText("3G(HSUPA)");
                                banda.setText("2100 MHz");
                                break;
                            case 11:
                                tipo.setText("Rádio(iDen)");
                                banda.setText("800 MHz");
                                break;
                            case 13:
                                tipo.setText("4G(LTE)");
                                banda.setText("700 MHz");
                                break;
                            case 3:
                                tipo.setText("3G(UMTS)");
                                banda.setText("2100 MHz");
                                break;
                            case 16:
                                tipo.setText("3G(GSM)");
                                banda.setText("");
                                break;
                            case 20:
                                tipo.setText("5G(NR)");
                                banda.setText("Banda desconhecida");
                            case 0:
                                tipo.setText("Sem internet");
                                banda.setText("-");
                                break;
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    }
}