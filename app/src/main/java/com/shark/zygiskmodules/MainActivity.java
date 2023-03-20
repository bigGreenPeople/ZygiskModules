package com.shark.zygiskmodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.shark.zygiskmodules.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'zygiskmodules' library on application startup.
    static {
        System.loadLibrary("zygiskmodules");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
    }

    /**
     * A native method that is implemented by the 'zygiskmodules' native library,
     * which is packaged with this application.
     */
}