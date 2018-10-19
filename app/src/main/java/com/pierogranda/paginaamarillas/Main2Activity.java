package com.pierogranda.paginaamarillas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView contactsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        contactsList = (RecyclerView) findViewById(R.id.contacts_list);

        contactsList.setLayoutManager(new LinearLayoutManager(this));

        ContactsAdapter adapter = new ContactsAdapter();

        List<Person> persons = PersonReposity.getPersons();
        adapter.setPersons(persons);

        contactsList.setAdapter(adapter);

    }
}
