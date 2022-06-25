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



Pojo Class 
---
```java
public class CustomPojo extends BaseAdapter {
    int images;
    String langName;

    public CustomPojo(int images, String langName) {
        this.images = images;
        this.langName = langName;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}

```

