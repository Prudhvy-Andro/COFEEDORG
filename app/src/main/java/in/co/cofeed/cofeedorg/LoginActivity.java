package in.co.cofeed.cofeedorg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.String;


public class LoginActivity extends Activity {
   String emails ="prudhvi339@gmail.com";
    String passwords ="5892";
    EditText edit, ed2;

    String a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edit = (EditText) findViewById(R.id.edit);
        ed2 = (EditText) findViewById(R.id.pwd);


    }

    public boolean login(View v) {
        String a = String.valueOf(edit.getText());
        String b = String.valueOf(ed2.getText());

        {
            if (emails.equals(a)) {
                if (passwords.equals(b)) {
                    Toast.makeText(this, "successfull", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(LoginActivity.this,Main2Activity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "unsuccessfull", Toast.LENGTH_SHORT).show();

                }
            }
        }
        return true;



 }
}
