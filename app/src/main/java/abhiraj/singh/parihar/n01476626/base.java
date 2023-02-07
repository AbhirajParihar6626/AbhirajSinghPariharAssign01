/**
 * Abhiraj Singh Parihar
 * n01476626
 * Section: ONA
 */
package abhiraj.singh.parihar.n01476626;

import android.content.Intent;
import android.net.Uri;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class base extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.base,menu);
        return true;

    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id)
        {
            case R.id.rent:
                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:6478322397"));
                startActivity(intent1);
                return true;

            case R.id.help:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/"));
                startActivity(intent);
                return true;

            case R.id.home:
                Intent intent2 = new Intent(this,MainActivity.class);
                startActivity(intent2);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}