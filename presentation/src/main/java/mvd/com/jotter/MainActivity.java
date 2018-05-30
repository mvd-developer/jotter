package mvd.com.jotter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mvd.com.domain.GetUserUseCase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GetUserUseCase getUserUseCase = new GetUserUseCase();
        setContentView(R.layout.activity_main);
        TextView tvUserName = findViewById(R.id.tvUserName);
        tvUserName.setText(getUserUseCase.getUserFromDB(0).getName());
    }
}
