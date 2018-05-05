package com.finepointmobile.famospeople;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Administrador on 23/04/2018.
 */

public class CreateUser extends AppCompatActivity{

    EditText firstName, lastName, email;
    Button button;

   @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.create_user);

       firstName = findViewById(R.id.first_name);
       lastName = findViewById(R.id.last_name);
       email = findViewById(R.id.email_name);
       button = findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });
   }
}
