/**
 * Abhiraj Singh Parihar
 * n01476626
 * Section: ONA
 */
package abhiraj.singh.parihar.n01476626;

import static abhiraj.singh.parihar.n01476626.R.id.radioGroup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends base {
    RadioGroup R1;
    ImageButton I1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        R1 = findViewById(radioGroup);
        I1 = findViewById(R.id.imageButton);
        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int radioid = R1.getCheckedRadioButtonId();
                switch(radioid){
                    case R.id.radioButton2:
                        openapartmentscreen();
                        break;
                    case R.id.radioButton3:
                        openhousescreen();
                        break;
                    default:
                        Toast.makeText(MainActivity2.this, "Please make a selection!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void openapartmentscreen(){
        Intent enterVisit = new Intent(this, apartment.class);
        startActivity(enterVisit);
    }
    private void openhousescreen(){
        Intent enterVisit2 = new Intent(this, detachhouse.class);
        startActivity(enterVisit2);
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

}