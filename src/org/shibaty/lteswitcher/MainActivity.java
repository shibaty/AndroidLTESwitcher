/**
 * MainActivity Class.
 */

package org.shibaty.lteswitcher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * MainActivity.
 *
 * @author shibaty
 */
public class MainActivity extends Activity {

    /**
     * Activity生成時の処理.
     *
     * @see android.content.Context#onCreate(Bundle)
     * @param savedInstanceState {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(Intent.ACTION_MAIN);
        // 電話テストモードのActivity（Xperiaの場合）
        intent.setClassName(
                "com.android.settings", "com.android.settings.RadioInfo");
        startActivity(intent);
        finish();
    }

}
