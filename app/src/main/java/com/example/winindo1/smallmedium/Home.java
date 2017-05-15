package com.example.winindo1.smallmedium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Home extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner);
        String[] items = new String[]{"Select Your Country","Afghanistan","Albania","Algeria","American Samoa(USA)","Andorra","Angola",
                "Anguilla(UK)","Antigua and Barbuda","Argentina","Armenia","Aruba(Netherlands)","Australia","Austria","Azerbaijan","Bahamas",
                "Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bermuda(UK)","Bhutan","Bolivia","Bosnia and Herzegovina",
                "Botswana","Botswana","British Virgin Islands(UK)","Brunei","Bulgaria","Burkina Faso","Burundi","Cambodia","Cameroon","Canada","Cape Verde",
                "Cayman Islands(UK)","Central African Republic","Chad","Chile","China","Christmas Island(Australia)", "Cocos(Keeling)Islands(Australia)","Colombia","Comoros",
                "Cook Islands(New Zealand)","Costa Rica","Croatia","Cuba","Curacao(Netherlands)","Cyprus","Czech Republic","D.R Congo","Denmark","Djibouti",
                "Dominica","Dominican Republic","East Timor(Timor-Leste)","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia",
                "Ethiopia","Falkland Islands(UK)","Faroe Islands(Denmark)","Fiji","Finland","France","French Guiana(France)","French Polynesia(France)",
                "Gabon","Gambia","Georgia","Germany","Ghana","Gibraltar(UK)","Greece","Greenland(Denmark)","Grenada","Guam(USA)","Guatemala","Guernsey(UK)",
                "Guinea","Guinea-Bissau","Guyana","Haiti","Honduras","Hong Kong(China)","Hungary","Iceland","India","Indonesia","Iran","Iraq",
                "Ireland","Isle of Man(UK)","Israel","Italy","Ivory Coast","Jamaica","Japan","Jersey(UK)","Jordan","Kazakhstan","Kenya","Kiribati",
                "Kosovo","Kuwait","Kyrgyzstan","Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg",
                "Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia",
                "Moldova","Monaco","Mongolia","Montenegro","Montserrat(UK)","Morocco","Mozambique","Myanmar","Namibia","Nauru","Nepal","Netherlands","New Caledonia(France)",
                "New Zealand","Nicaragua","Niger","Nigeria","Niue(New Zealand)","Norfolk Island(Australia)","North Korea","Northern Mariana Islands(USA)",
                "Norway","Oman","Palau","Palestine","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Pitcairn Islands(UK)","Poland","Portugal","Puerto Rico(USA)",
                "Qatar","Republic of the Congo","Romania","Russia","Rwanda","Saint Barthelemy","Saint Helena,Ascension and Tristan da C",
                "Saint Kitts and Nevis","Saint Lucia","Saint Martin","Saint Pierre and Miquelon(France)","Saint Vincent and the Grenadines",
                "Samoa","San Marino","São Tomé and Príncipe","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore",
                "Sint Maarten(Netherlands)","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa","South Korea","South Sudan","Spain","Sri Lanka",
                "Sudan","Suriname","Swaziland","Sweden","Switzerland","Syria","Taiwan","Tajikistan","Tanzania","Thailand","Togo","Tokelau(New Zealand)",
                "Tonga","Transnistria","Trinidad and Tobago","Tunisia","Turkey","Turkmenistan","Turks and Caicos Islands(UK)","Tuvalu",
                "Uganda","Ukraine","United Arab Emirates","United Kingdom","United States","United States Virgin Islands(USA)","Uruguay","Uzbekistan",
                "Vanuatu","Vatican City","Venezuela","Vietnam","Wallis and Futuna(France)","Western Sahara","Yemen","Zambia","Zimbabwe"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        b=(Button)findViewById(R.id.nextButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Products.class);
                startActivity(i);
            }
        });
    }
}
