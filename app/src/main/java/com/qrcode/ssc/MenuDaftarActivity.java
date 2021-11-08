package com.qrcode.ssc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

public class MenuDaftarActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView backbutton, cambutton,
            cv1, cv2, cv3, cv4, cv5, cv6, cv7, cv8, cv9, cv10,
            cv11, cv12, cv13, cv14, cv15, cv16, cv17, cv18, cv19, cv20,
            cv21, cv22, cv23, cv24, cv25, cv26, cv27, cv28, cv29, cv30,
            cv31, cv32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_daftar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView iv1 = findViewById(R.id.gamb_start_up_valve);
        ImageView iv2 = findViewById(R.id.gamb_io_terminal);
        ImageView iv3 = findViewById(R.id.gamb_air_solenoid_valve_c);
        ImageView iv4 = findViewById(R.id.gamb_air_solenoid_valve_b);
        ImageView iv5 = findViewById(R.id.gamb_air_solenoid_valve_a);
        ImageView iv6 = findViewById(R.id.gamb_key_op_sw);
        ImageView iv7 = findViewById(R.id.gamb_one_way_flow_control2);
        ImageView iv8 = findViewById(R.id.gamb_one_way_flow_control1);
        ImageView iv9 = findViewById(R.id.gamb_micro_switch);
        ImageView iv10 = findViewById(R.id.gamb_connecting_cable_b);
        ImageView iv11 = findViewById(R.id.gamb_connecting_cable);
        ImageView iv12 = findViewById(R.id.gamb_proximity_sensor);
        ImageView iv13 = findViewById(R.id.gamb_relay_module);
        ImageView iv14 = findViewById(R.id.gamb_pneumatic_gripper);
        ImageView iv15 = findViewById(R.id.gamb_pneumatic_liniear_drive);
        ImageView iv16 = findViewById(R.id.gamb_proximity_sensor2);
        ImageView iv17 = findViewById(R.id.gamb_planar_surface_gantry_module);
        ImageView iv18 = findViewById(R.id.gamb_electrical_toothed_belt_axis);
        ImageView iv19 = findViewById(R.id.gamb_cp_valve_terminal);
        ImageView iv20 = findViewById(R.id.gamb_storage_places_module);
        ImageView iv21 = findViewById(R.id.gamb_aluminum_profile_plate);
        ImageView iv22 = findViewById(R.id.gamb_control_console);
        ImageView iv23 = findViewById(R.id.gamb_plc_device);
        ImageView iv24 = findViewById(R.id.gamb_mps_trolley);
        ImageView iv25 = findViewById(R.id.gamb_pa_workpiece);
        ImageView iv26 = findViewById(R.id.gamb_push_in_lfitting_b);
        ImageView iv27 = findViewById(R.id.gamb_silencer);
        ImageView iv28 = findViewById(R.id.gamb_push_in_lfitting_rotatable);
        ImageView iv29 = findViewById(R.id.gamb_vacuum_filter);
        ImageView iv30 = findViewById(R.id.gamb_non_return_valve);
        ImageView iv31 = findViewById(R.id.gamb_plastic_tubing);
        ImageView iv32 = findViewById(R.id.gamb_plastic_tubing_b);

        String ui1 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FService%20unit%20with%20onoff%20valve.JPG?alt=media&token=5f58fed7-8a13-428c-9ead-6e37fca0e0ae";
        String ui2 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FIO%20Interface.JPG?alt=media&token=eb0472b3-dc00-426a-8377-82d8ca77b8e5";
        String ui3 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FSolenoid%20valve%20CPV10-M1H-5JS-M7.jpg?alt=media&token=5922ebb5-4c24-44f1-8fc0-8f8b84a16de0";
        String ui4 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FAir%20solenoid%20valve2%2Fair_solenoid_valveb1.jpg?alt=media&token=653c00bf-cbcb-4ed7-803f-b48409dd7f54";
        String ui5 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FAir%20solenoid%20valve%2Fair_solenoid_valvea1.jpg?alt=media&token=ac299f0b-616d-42eb-9fde-1f10a2543a96";
        String ui6 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FKey-Operated%20Switch2.jpg?alt=media&token=16cfbd55-633f-4c3c-a584-a300399a41f8";
        String ui7 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FOne-way%20flow%20control%20valve.jpg?alt=media&token=e0fcb76c-ed49-4666-857a-bc7190ad240f";
        String ui8 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FOne-way%20flow%20control%20valve%2Fone_way_flow_control_valve1.jpg?alt=media&token=8881ce49-8d9a-4d85-b9fa-297248868c1b";
        String ui9 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FMicro%20switch1.jpg?alt=media&token=64160146-bc26-4be4-be64-ce5081f65ba0";
        String ui10 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FConnecting%20cable2%2Fconnecting_cableb1.jpg?alt=media&token=e5a0b827-482e-49a5-98d6-e7f46e5bf647";
        String ui11 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FConnecting%20cable%2Fconnecting_cable1.jpg?alt=media&token=d5b16ad3-af7a-4d6e-a082-d7fa433eccee";
        String ui12 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FProximity%20sensor%2Fproximity_sensor1.jpg?alt=media&token=2f3ab895-e2a1-4631-aee1-f5514a2826de";
        String ui13 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2F1.%20Relay%20%5B1%5D.jpg?alt=media&token=04af5f7e-094b-4ae3-9119-7dda138c8507";
        String ui14 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2F6.%20Gripper%20%5B1%5D.PNG?alt=media&token=7fe8e8ee-a3c9-4eed-a1f8-430f68be32ae";
        String ui15 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2F4.%20Pneumatic%20Liniear%20Drive%20%5B1%5D.jpg?alt=media&token=2233d9d8-9c26-47c2-a184-ed00923f3098";
        String ui16 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2Fproximity%20switch%202.jpg?alt=media&token=c8b42b3f-eab5-4cfe-bdfa-7aed7f04e65f";
        String ui17 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2F10.%20Handling%20Module%20%5B1%5D.jpg?alt=media&token=74c6dae3-a5b3-4343-b672-5245893ed312";
        String ui18 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2F8.%20Electrical%20Toothed%20Belt%20Axis%20%5B1%5D.PNG?alt=media&token=bdb32457-d188-40c7-af59-fc23603d68dc";
        String ui19 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2FCP%20Valve%20Terminal1.jpg?alt=media&token=956d19ee-e63c-4230-97c1-ffc9478cfa56";
        String ui20 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2F12.%20Workpiece%20Reception%20Module%20%5B1%5D.jpg?alt=media&token=beac5ff6-81d0-43eb-ab86-580f467ae02d";
        String ui21 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FAluminum%20profile%20plate.jpg?alt=media&token=b59f1de6-7d91-4c78-8c65-1397c3fa28e1";
        String ui22 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2Fcontrolpanel.jpg?alt=media&token=bf826e2f-5ae2-40de-84c2-cab26b137e3d";
        String ui23 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.3%2FPLC.jpg?alt=media&token=5ccb1024-1ffc-4a42-a7a7-ac90db9da4ef";
        String ui24 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FTrolley%20with%20plate.jpg?alt=media&token=72857bd1-a45a-444e-a7fd-2a9418d9a66e";
        String ui25 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPart%2FPA%20workpiece.jpg?alt=media&token=26fd7530-d68c-47b0-9876-44a55c583f3b";
        String ui26 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting2%2Fpush_in_l_fittingb1.jpg?alt=media&token=b4f32ca5-788f-42cd-9340-4d13facb346c";
        String ui27 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/rev1.2%2FSilencer.jpg?alt=media&token=cc87d42f-86b0-40c6-8cc1-696333c39cc4";
        String ui28 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPush-in%20L-fitting%2C%20rotatable%2Fpush_in_l_fitting_rotatable1.jpg?alt=media&token=bab28f24-f9a2-44c2-addf-5ca73af854d3";
        String ui29 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FVacuum%20filter%2Fvacuum_filter1.jpg?alt=media&token=df577b2b-0be3-4cc1-9089-f030815c12b6";
        String ui30 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FNon%20return%20valve%2Fnon_return_valve1.jpg?alt=media&token=1c27f069-e126-4321-b6c0-f3330bf1b5fd";
        String ui31 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPlastic%20tubing%2Fplastic_tubing1.jpg?alt=media&token=4db4de74-48ff-4af7-80ba-bea55eeb1586";
        String ui32 = "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/image%2FPlastic%20tubing2%2Fplastic_tubingb1.jpg?alt=media&token=e7c652e8-939a-4c46-bb7e-f740fe41af3c";

        Picasso.get().load(ui1).into(iv1);
        Picasso.get().load(ui2).into(iv2);
        Picasso.get().load(ui3).into(iv3);
        Picasso.get().load(ui4).into(iv4);
        Picasso.get().load(ui5).into(iv5);
        Picasso.get().load(ui6).into(iv6);
        Picasso.get().load(ui7).into(iv7);
        Picasso.get().load(ui8).into(iv8);
        Picasso.get().load(ui9).into(iv9);
        Picasso.get().load(ui10).into(iv10);
        Picasso.get().load(ui11).into(iv11);
        Picasso.get().load(ui12).into(iv12);
        Picasso.get().load(ui13).into(iv13);
        Picasso.get().load(ui14).into(iv14);
        Picasso.get().load(ui15).into(iv15);
        Picasso.get().load(ui16).into(iv16);
        Picasso.get().load(ui17).into(iv17);
        Picasso.get().load(ui18).into(iv18);
        Picasso.get().load(ui19).into(iv19);
        Picasso.get().load(ui20).into(iv20);
        Picasso.get().load(ui21).into(iv21);
        Picasso.get().load(ui22).into(iv22);
        Picasso.get().load(ui23).into(iv23);
        Picasso.get().load(ui24).into(iv24);
        Picasso.get().load(ui25).into(iv25);
        Picasso.get().load(ui26).into(iv26);
        Picasso.get().load(ui27).into(iv27);
        Picasso.get().load(ui28).into(iv28);
        Picasso.get().load(ui29).into(iv29);
        Picasso.get().load(ui30).into(iv30);
        Picasso.get().load(ui31).into(iv31);
        Picasso.get().load(ui32).into(iv32);

        cv1 = findViewById(R.id.start_up_valve);
        cv2 = findViewById(R.id.io_terminal);
        cv3 = findViewById(R.id.air_solenoid_valve_c);
        cv4 = findViewById(R.id.air_solenoid_valve_b);
        cv5 = findViewById(R.id.air_solenoid_valve_a);
        cv6 = findViewById(R.id.key_op_sw);
        cv7 = findViewById(R.id.one_way_flow_control2);
        cv8 = findViewById(R.id.one_way_flow_control1);
        cv9 = findViewById(R.id.micro_switch);
        cv10 = findViewById(R.id.connecting_cable_b);
        cv11 = findViewById(R.id.connecting_cable);
        cv12 = findViewById(R.id.proximity_sensor);
        cv13 = findViewById(R.id.relay_module);
        cv14 = findViewById(R.id.pneumatic_gripper);
        cv15 = findViewById(R.id.pneumatic_liniear_drive);
        cv16 = findViewById(R.id.proximity_sensor2);
        cv17 = findViewById(R.id.planar_surface_gantry_module);
        cv18 = findViewById(R.id.electrical_toothed_belt_axis);
        cv19 = findViewById(R.id.cp_valve_terminal);
        cv20 = findViewById(R.id.storage_places_module);
        cv21 = findViewById(R.id.aluminum_profile_plate);
        cv22 = findViewById(R.id.control_console);
        cv23 = findViewById(R.id.plc_device);
        cv24 = findViewById(R.id.mps_trolley);
        cv25 = findViewById(R.id.pa_workpiece);
        cv26 = findViewById(R.id.push_in_lfitting_b);
        cv27 = findViewById(R.id.silencer);
        cv28 = findViewById(R.id.push_in_lfitting_rotatable);
        cv29 = findViewById(R.id.vacuum_filter);
        cv30 = findViewById(R.id.non_return_valve);
        cv31 = findViewById(R.id.plastic_tubing);
        cv32 = findViewById(R.id.plastic_tubing_b);

        backbutton = findViewById(R.id.backBtn);
        cambutton = findViewById(R.id.camBtn);

        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);
        cv4.setOnClickListener(this);
        cv5.setOnClickListener(this);
        cv6.setOnClickListener(this);
        cv7.setOnClickListener(this);
        cv8.setOnClickListener(this);
        cv9.setOnClickListener(this);
        cv10.setOnClickListener(this);
        cv11.setOnClickListener(this);
        cv12.setOnClickListener(this);
        cv13.setOnClickListener(this);
        cv14.setOnClickListener(this);
        cv15.setOnClickListener(this);
        cv16.setOnClickListener(this);
        cv17.setOnClickListener(this);
        cv18.setOnClickListener(this);
        cv19.setOnClickListener(this);
        cv20.setOnClickListener(this);
        cv21.setOnClickListener(this);
        cv22.setOnClickListener(this);
        cv23.setOnClickListener(this);
        cv24.setOnClickListener(this);
        cv25.setOnClickListener(this);
        cv26.setOnClickListener(this);
        cv27.setOnClickListener(this);
        cv28.setOnClickListener(this);
        cv29.setOnClickListener(this);
        cv30.setOnClickListener(this);
        cv31.setOnClickListener(this);
        cv32.setOnClickListener(this);
        backbutton.setOnClickListener(this);
        cambutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.start_up_valve: i = new Intent(this,StartUpValve.class); startActivity(i); break;
            case R.id.io_terminal: i = new Intent(this,IoTerminal.class); startActivity(i); break;
            case R.id.air_solenoid_valve_c: i = new Intent(this,AirSolenoidValveC.class); startActivity(i); break;
            case R.id.air_solenoid_valve_b: i = new Intent(this,AirSolenoidValveB.class); startActivity(i); break;
            case R.id.air_solenoid_valve_a: i = new Intent(this,AirSolenoidValveA.class); startActivity(i); break;
            case R.id.key_op_sw: i = new Intent(this,KeyOperatedSwitch.class); startActivity(i); break;
            case R.id.one_way_flow_control2: i = new Intent(this,OneWayFlowControlValve2.class); startActivity(i); break;
            case R.id.one_way_flow_control1: i = new Intent(this,OneWayFlowControlValve.class); startActivity(i); break;
            case R.id.micro_switch: i = new Intent(this,MicroSwitch.class); startActivity(i); break;
            case R.id.connecting_cable_b: i = new Intent(this,ConnectingCableB.class); startActivity(i); break;
            case R.id.connecting_cable: i = new Intent(this,ConnectingCable.class); startActivity(i); break;
            case R.id.proximity_sensor: i = new Intent(this,ProximitySensor.class); startActivity(i); break;
            case R.id.relay_module: i = new Intent(this,RelayModul.class); startActivity(i); break;
            case R.id.pneumatic_gripper: i = new Intent(this,Gripper.class); startActivity(i); break;
            case R.id.pneumatic_liniear_drive: i = new Intent(this,PneumaticLinierDrive.class); startActivity(i); break;
            case R.id.proximity_sensor2: i = new Intent(this,ProximitySensor2.class); startActivity(i); break;
            case R.id.planar_surface_gantry_module: i = new Intent(this,HandlingModule.class); startActivity(i); break;
            case R.id.electrical_toothed_belt_axis: i = new Intent(this,EtbAxis.class); startActivity(i); break;
            case R.id.cp_valve_terminal: i = new Intent(this,CpValveTerminal.class); startActivity(i); break;
            case R.id.storage_places_module: i = new Intent(this,WrModule.class); startActivity(i); break;
            case R.id.aluminum_profile_plate: i = new Intent(this,AluminumProfilePlate.class); startActivity(i); break;
            case R.id.control_console: i = new Intent(this,ControlConsole.class); startActivity(i); break;
            case R.id.plc_device: i = new Intent(this,PlcDevice.class); startActivity(i); break;
            case R.id.mps_trolley: i = new Intent(this,MpsTrolley.class); startActivity(i); break;
            case R.id.pa_workpiece: i = new Intent(this,PaWorkpiece.class); startActivity(i); break;
            case R.id.push_in_lfitting_b: i = new Intent(this,PushInLFittingB.class); startActivity(i); break;
            case R.id.silencer: i = new Intent(this,Silencer.class); startActivity(i); break;
            case R.id.push_in_lfitting_rotatable: i = new Intent(this,PushInLFittingRotatable.class); startActivity(i); break;
            case R.id.vacuum_filter: i = new Intent(this,VacuumFilter.class); startActivity(i); break;
            case R.id.non_return_valve: i = new Intent(this,NonReturnValve.class); startActivity(i); break;
            case R.id.plastic_tubing: i = new Intent(this,PlasticTubing.class); startActivity(i); break;
            case R.id.plastic_tubing_b: i = new Intent(this,PlasticTubingB.class); startActivity(i); break;
            case R.id.backBtn: onBackPressed(); break;
            case R.id.camBtn: i = new Intent(this,MenuScannerActivity.class); startActivity(i); break;
            default:break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}