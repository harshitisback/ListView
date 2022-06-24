# ListView

---
XML CODE
---
```xml
<ListView
        android:id="@+id/lv"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

    </ListView>
```

MainActivity.java
---

```java
public class MainActivity extends AppCompatActivity {

    String arr[] = {"hello ", "ram", "sita", "mohan ", "karma", "shyam", "mohan","hello ", "ram", "sita", "mohan ", "karma", "shyam","hello ", "ram", "sita", "mohan ", "karma", "shyam",  };
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.support.constraint.R.layout.support_simple_spinner_dropdown_item,arr);
       l.setAdapter(adapter);
    }
}
```


 
ScreenShot Demo
---
![image](https://user-images.githubusercontent.com/77660268/175664384-2580b010-3f2d-4884-9f10-59e5f0fd9cfb.png)

