package com.dsi32g5.consommationTunisienne;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class DisplayInfoActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;






        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.drawer_view, menu);
            return true;
        }
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_display_info);
            TextView t = (TextView)findViewById(R.id.textView3);
            t.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    openpropos();

                }

            });}
        public void openpropos(){
            Intent intent=new Intent(this,Propos.class);
            startActivity(intent);
        }



        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_camera:
                    startActivity(new Intent(this, Propos.class));
                    return true;
                case R.id.nav_ar:
                    startActivity(new Intent(this, Arabe.class));
                    return true;
                case R.id.nav_fr:
                    startActivity(new Intent(this, Francais.class));
                    return true;
                case R.id.nav_liste:
                    startActivity(new Intent(this, Liste.class));
                    return true;
                case R.id.nav_send:
                    startActivity(new Intent(this, Liste.class));
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
    }

