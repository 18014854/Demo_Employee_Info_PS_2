package sg.edu.rp.c346.id18014854.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee> employeeList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);

        employeeList = new ArrayList<>();

        Employee person1 = new Employee("John", "Software Technical Leader", 3400.0);
        Employee person2 = new Employee("May", "Programmer", 2200.0);

        employeeList.add(person1);
        employeeList.add(person2);

        adapter = new CustomAdapter(this,R.layout.row,employeeList);

        lvEmployee.setAdapter(adapter);
    }
}
