package com.example.user.teamproject;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.couchbase.lite.CouchbaseLiteException;
import com.couchbase.lite.DataSource;
import com.couchbase.lite.Database;
import com.couchbase.lite.DatabaseConfiguration;
import com.couchbase.lite.Expression;
import com.couchbase.lite.MutableDocument;
import com.couchbase.lite.Query;
import com.couchbase.lite.QueryBuilder;
import com.couchbase.lite.ResultSet;
import com.couchbase.lite.SelectResult;

import java.io.ByteArrayOutputStream;

public class LoginPageActivity extends AppCompatActivity {
    EditText loginUsername, loginPassword;
    TextView needAccount;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);



        //跳转灯枯界面
        needAccount = findViewById(R.id.needAccount);
        SpannableString ss = new SpannableString("Дайте имя и Введите информация");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent intent = new Intent(LoginPageActivity.this, SignupPageActivity.class);
                startActivity(intent);
                finish();
            }
        };
        //set clickable text设置可点击的文字
        ss.setSpan(clickableSpan, 0, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        needAccount.setText(ss);
        needAccount.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void toastNote(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
