/**
 * Abhiraj Singh Parihar
 * n01476626
 * Section: ONA
 */
package abhiraj.singh.parihar.n01476626;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class apartment extends base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}