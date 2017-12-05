package megadroid.drivinggame.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import megadroid.drivinggame.R;

/**
 * Created by Pemi on 2017-11-26.
 */


public class ExitActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_Dialog);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            //the transition from MenuActivity to GameActivity
            case R.id.cross:
                startActivity(new Intent(ExitActivity.this, MenuActivity.class));
                break;

            case R.id.checkmark:
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(startMain);
                this.finish();
                break;

            default:
                break;
        }


    }
}
