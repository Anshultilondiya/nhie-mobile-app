package com.app.neverhavei;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;








public class MainActivity extends AppCompatActivity {
    private static final String TAG ="Main Activity" ;

    public void clickFunction(View view){
        EditText personName= (EditText)findViewById(R.id.PersonName);

        Toast.makeText(MainActivity.this,"de",Toast.LENGTH_LONG).show();
        Log.i(TAG, personName.getText().toString());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://<yourapp>.herokuapp.com/")
                .build();

        final HerokuService service = retrofit.create(HerokuService.class);
    }
}