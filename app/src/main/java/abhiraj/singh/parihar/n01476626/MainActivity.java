/**
 * Name: Abhiraj Singh Parihar
 * Student ID: n01476626
 * Section: CENG258 (ONA)
 */
package abhiraj.singh.parihar.n01476626;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends base {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void secondscren(View view){
        String name = getString(R.string.full_name);
        Toast.makeText(this, R.string.full_name, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("key",name);
        startActivity(intent);
    }
    @Override
    public  void onBackPressed(){
        View parentLayout =
                findViewById(android.R.id.content);
        Snackbar.make(parentLayout, R.string.Goback,
                        Snackbar.LENGTH_LONG)
                .setAction("Yes",
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {finish();} }) .show();

    }

    public void secondscreen(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}