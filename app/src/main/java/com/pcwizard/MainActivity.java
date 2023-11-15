package com.pcwizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Toast;

import com.example.pcwizard.R;
import com.pcwizard.Componente.*;
import com.pcwizard.Componente.Componentes.Alimentacion;
import com.pcwizard.Componente.Componentes.Almacenamiento;
import com.pcwizard.Componente.Componentes.Caja;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;
import com.pcwizard.Componente.Componentes.Enumerados.TipoDiscoDuro;
import com.pcwizard.Componente.Componentes.Grafica;
import com.pcwizard.Componente.Componentes.Microprocesador;
import com.pcwizard.Componente.Componentes.Monitor;
import com.pcwizard.Componente.Componentes.PlacaBase;
import com.pcwizard.Componente.Componentes.RAM;
import com.pcwizard.Componente.Componentes.Raton;
import com.pcwizard.Componente.Componentes.Refrigeracion;
import com.pcwizard.Componente.Componentes.SistemaOperativo;
import com.pcwizard.Componente.Componentes.Teclado;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    public static ArrayList<Presupuesto> presupuestos = new ArrayList<Presupuesto>();
    public static ArrayList<Componente> componentes = new ArrayList<>();
    public static boolean premium = false;
    public static Presupuesto presupuesto;
    public static Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.savedInstanceState = savedInstanceState;

        componentes.add(new PlacaBase("Asus TUF GAMING B550-PLUS AMD", R.drawable.iv_asus_tuf_gaming_b550_plus, Memoria.DDR4, Chipset.AMD));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 96.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 99.99));
        componentes.add(new PlacaBase("Asus Prime B760-PLUS", R.drawable.iv_asus_prime_b760_plus  ,Memoria.DDR5, Chipset.INTEL));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 96.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 99.99));
        componentes.add(new Microprocesador("AMD Ryzen 7 5700G 4.6GHz", R.drawable.iv_amd_ryzen_7_5700g_46ghz,4.6, 8, 16, Memoria.DDR4, Chipset.AMD));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 339.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 349.99));
        componentes.add(new Microprocesador("Intel Core i7-13700KF 3.4 GHz", R.drawable.iv_intel_core_i7_13700kf_34_ghz_box,3.4, 16, 24, Memoria.DDR5, Chipset.INTEL));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 389.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 399.99));
        componentes.add(new RAM("Corsair Vengeance DDR5 6200MHz 32GB 2x16GB CL36", R.drawable.iv_corsair_vengeance_ddr5_6200mhz_32gb_2x16gb_cl36_negra,32, 6300, 36, Memoria.DDR5));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 132.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 134.99));
        componentes.add(new RAM("Corsair Vengeance LPX DDR4 3200MHz PC4-25600 32GB 2x16GB CL16", R.drawable.iv_corsair_vengeance_lpx_ddr4_3200mhz_pc4_25600_32gb_2x16gb_cl16, 32, 3200, 16, Memoria.DDR4));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 132.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 134.99));
        componentes.add(new Caja("Nox Hummer Quantum Cristal Templado USB 3.0 ARGB", R.drawable.iv_nox_hummer_quantum_cristal_templado_usb_30_argb, 210, 510, 447));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 70.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 75.99));
        componentes.add(new Caja("Forgeon Khaydarin ARGB Mesh Torre ATX Negra", R.drawable.iv_forgeon_khaydarin_argb_mesh_torre_atx_negra , 220, 490, 448));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 103.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 109.99));
        componentes.add(new Refrigeracion("Cooler Master Hyper 622 Halo Ventilador CPU 120mm Negro", R.drawable.iv_cooler_master_hyper_622_halo_ventilador_cpu_120mm_negro ,12, true));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 54.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 59.99));
        componentes.add(new Refrigeracion("Tempest Cooler 4Pipes 2x120mm RGB Ventilador CPU Negro", R.drawable.iv_tempest_cooler_4pipes_2x120mm_rgb_ventilador_cpu_negro_review ,12, true));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 25.49));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 29.99));
        componentes.add(new Alimentacion("UNYKAch Atilius RGB Fuente de Alimentación 750W Eficiencia 90% Full Modular", R.drawable.iv_unykach_atilius_rgb_750w_80_plus_gold_modular , 750, true));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 85.0));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 89.99));
        componentes.add(new Alimentacion("L-Link Fuente de Alimentación 650W PFC", R.drawable.ll_ps_650_1_700x600 ,650, false));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 85.0));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 89.99));
        componentes.add(new Grafica("ASUS TUF Gaming GeForce RTX 3070 Ti V2 OC Edition 8GB GDDR6X", R.drawable.iv_asus_tuf_gaming_geforce_rtx_3070_ti_v2_oc_edition_8gb_gddr6x , 8, 1785,750));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 668.24));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 669.99));
        componentes.add(new Grafica("Gigabyte GeForce RTX 3060 GAMING OC 12GB GDDR6 Rev 2.0", R.drawable.iv_gigabyte_geforce_rtx_3060_gaming_oc_12gb_gddr6_rev_20 ,12, 1500,650));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 299.90));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 319.99));
        componentes.add(new Almacenamiento("Samsung 980 SSD 1TB PCIe 3.0 NVMe M.2", R.drawable.iv_samsung_980_ssd_1tb_pcie_30_nvme_m2 , TipoDiscoDuro.SSD_NvME ,1024, 3500,3000));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 58.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 59.99));
        componentes.add(new Almacenamiento("Samsung 870 QVO SSD 1TB SATA3", R.drawable.iv_samsung_870_qvo_ssd_1tb_sata3 ,TipoDiscoDuro.SSD ,1024, 560,530));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 53.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 54.99));
        componentes.add(new SistemaOperativo("Microsoft Windows 11 Home 64 Bits OEM", R.drawable.iv_microsoft_windows_11_home_64bits_oem , "Home",11));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 157.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 159.99));
        componentes.add(new SistemaOperativo("Linux Ubuntu Desktop 22" , R.drawable.iv_ubuntu , "Ubuntu",22));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("Ubuntu", 0.0));
        componentes.add(new Monitor("Newskill Icarus IC27I4K144 27\" LED IPS UltraHD 4K 144Hz G-Sync Compatible", R.drawable.iv_newskill_icarus_ic27i4k144_27_led_ips_ultrahd_4k_144hz_g_sync_compatible , 27,144));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 499.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 509.99));
        componentes.add(new Monitor("AOC 24G2SPAE/BK 23.8'' LED IPS FullHD 165Hz FreeSync Premium" , R.drawable.iv_aoc_24g2spae_bk_238_led_ips_fullhd_165hz_freesync_premium , 23.8,165));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 119.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 124.99));
        componentes.add(new Teclado("Razer BlackWidow V3 TKL Teclado Gaming Retroiluminado Yellow Switch", R.drawable.iv_razer_blackwidow_v3_tenkeyless_teclado_gaming_retroiluminado_yellow_switch , true,"QWERTY", false));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 127.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 129.99));
        componentes.add(new Teclado("Logitech MX Keys Teclado Inalámbrico Avanzado Grafito", R.drawable.iv_logitech_mx_keys_teclado_inalambrico_avanzado_grafito ,false,"QWERTY", true));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 89.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 94.99));
        componentes.add(new Raton("Razer Deathadder Essential Ratón Gaming 6400 DPI Negro", R.drawable.iv_razer_deathadder_essential_raton_gaming_6400_dpi_negro , 6400,false, true));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 21.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 24.99));
        componentes.add(new Raton("Logitech M185 Ratón Inalámbrico 1000DPI Gris" , R.drawable.iv_logitech_wireless_mouse_m185_gris , 1000,true, true));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 13.0));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 14.99));

    }

    public void nuevoPresupuesto (View view){
        if(premium == true || (premium == false && presupuestos.size() < 2)) {
            presupuesto = new Presupuesto();
            Intent intent = new Intent(this, PresupuestoActivity.class);
            startActivity(intent);
            presupuestos.add(presupuesto);
        }else{
            Toast.makeText(this, "Alcanzado el máximo de presupuestos de la versión gratuita.", Toast.LENGTH_SHORT).show();
        }
    }

    public void misPresupuestos(View view){
        Intent intent = new Intent(this, PresupuestosGuardadosActivity.class);
        startActivity(intent);
    }

    public void guiasMontaje(View view){
        Toast.makeText(this, "¡Disponible en próximas versiones!", Toast.LENGTH_SHORT).show();
    }

    public void premium(View view){
        if(!premium){
            premium = true;
            Toast.makeText(this, "Modo premium: ACTIVADO", Toast.LENGTH_SHORT).show();
        }else{
            premium = false;
            Toast.makeText(this, "Modo premium: DESACTIVADO", Toast.LENGTH_SHORT).show();
        }
    }
}