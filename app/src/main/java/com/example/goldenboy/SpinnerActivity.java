package com.example.goldenboy;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    Button button;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        listView = findViewById(R.id.listView);

        ArrayList<City> cities = createMockData();
        ArrayList<String> cityNames = new ArrayList<>();
        for (City city : cities) {
            cityNames.add(city.getName());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, cityNames);

        spinner.setAdapter(adapter);

        button.setOnClickListener(v -> {
            int position = spinner.getSelectedItemPosition();
            City city = cities.get(position);
            ArrayList<Gym> gyms = city.getGyms();
            ArrayList<String> gymNames = new ArrayList<>();
            for (Gym gym : gyms) {
                gymNames.add(gym.getName());
            }
            ArrayAdapter<String> gymAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gymNames);
            listView.setAdapter(gymAdapter);
        });

    }


    public ArrayList<City> createMockData(){
        Coach coach1 = new Coach("Mahmoud", "Bodybuilding", "0599767544");
        Coach coach2 = new Coach("Ahmed", "Crossfit", "0599767544");
        Coach coach3 = new Coach("Ali", "Yoga", "0599767544");
        Coach coach4 = new Coach("Omar", "Bodybuilding", "0599767544");
        Coach coach5 = new Coach("Somaya", "Zumba", "0599767544");
        Coach coach6 = new Coach("Nour", "Yoga", "0599767544");

        ArrayList<Coach> coaches1 = new ArrayList<>();
        coaches1.add(coach1);
        coaches1.add(coach2);

        ArrayList<Coach> coaches2 = new ArrayList<>();
        coaches2.add(coach3);
        coaches2.add(coach4);

        ArrayList<Coach> coaches3 = new ArrayList<>();
        coaches3.add(coach5);
        coaches3.add(coach6);

        Gym gym1 = new Gym("Tiger", "Masyoon", coaches1);
        Gym gym2 = new Gym("Star", "Al-Bireh", coaches2);
        Gym gym3 = new Gym("Fire", "Batoonya", coaches3);

        ArrayList<Gym> gyms = new ArrayList<>();
        gyms.add(gym1);
        gyms.add(gym2);
        gyms.add(gym3);

        City city1 = new City("Ramallah", gyms);

        Coach coach7 = new Coach("Sami", "Kickboxing", "0599988776");
        Coach coach8 = new Coach("Layla", "Pilates", "0599988777");
        Coach coach9 = new Coach("Yousef", "Spinning", "0599988778");
        Coach coach10 = new Coach("Mona", "Zumba", "0599988779");
        Coach coach11 = new Coach("Hassan", "Crossfit", "0599988780");
        Coach coach12 = new Coach("Sara", "Yoga", "0599988781");

        ArrayList<Coach> coaches4 = new ArrayList<>();
        coaches4.add(coach7);
        coaches4.add(coach8);

        ArrayList<Coach> coaches5 = new ArrayList<>();
        coaches5.add(coach9);
        coaches5.add(coach10);

        ArrayList<Coach> coaches6 = new ArrayList<>();
        coaches6.add(coach11);
        coaches6.add(coach12);

        Gym gym4 = new Gym("Lion", "Shawiki", coaches4);
        Gym gym5 = new Gym("Comet", "Anabta", coaches5);
        Gym gym6 = new Gym("Hot", "Ateel", coaches6);

        ArrayList<Gym> gymsTulkarem = new ArrayList<>();
        gymsTulkarem.add(gym4);
        gymsTulkarem.add(gym5);
        gymsTulkarem.add(gym6);

        City city2 = new City("Tulkarem", gymsTulkarem);

        Coach coach13 = new Coach("Khaled", "Bodybuilding", "0599988882");
        Coach coach14 = new Coach("Nadia", "Aerobics", "0599988883");
        Coach coach15 = new Coach("Mazin", "Powerlifting", "0599988884");
        Coach coach16 = new Coach("Reem", "Pilates", "0599988885");
        Coach coach17 = new Coach("Omar", "Martial Arts", "0599988886");
        Coach coach18 = new Coach("Faten", "Crossfit", "0599988887");

        ArrayList<Coach> coaches7 = new ArrayList<>();
        coaches7.add(coach13);
        coaches7.add(coach14);

        ArrayList<Coach> coaches8 = new ArrayList<>();
        coaches8.add(coach15);
        coaches8.add(coach16);

        ArrayList<Coach> coaches9 = new ArrayList<>();
        coaches9.add(coach17);
        coaches9.add(coach18);

        Gym gym7 = new Gym("Jaguare", "Al-Jabal", coaches7);
        Gym gym8 = new Gym("Alien", "Old City", coaches8);
        Gym gym9 = new Gym("Storm", "Al-Makhfiya", coaches9);

        ArrayList<Gym> gymsNablus = new ArrayList<>();
        gymsNablus.add(gym7);
        gymsNablus.add(gym8);
        gymsNablus.add(gym9);

        City city3 = new City("Nablus", gymsNablus);


        ArrayList<City> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);


        return cities;
    }
}