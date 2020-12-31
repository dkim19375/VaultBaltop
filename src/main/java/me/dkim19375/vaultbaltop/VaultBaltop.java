package me.dkim19375.vaultbaltop;

import me.dkim19375.dkim19375core.CoreJavaPlugin;
import me.dkim19375.vaultbaltop.api.BaltopAPIProvider;
import me.dkim19375.vaultbaltop.api.impl.VaultBaltopAPI;
import me.dkim19375.vaultbaltop.api.interf.IBaltop;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.logging.Level;

public class VaultBaltop extends CoreJavaPlugin {

    private static Economy economy = null;

    @Override
    public void onEnable() {
        VaultBaltopAPI api = new IBaltop();
        BaltopAPIProvider.register(api);
        boolean b = setupEconomy();
        if (!b) {
            Bukkit.getLogger().log(Level.SEVERE, "Cannot setup economy!!");
        }
/*        getCommand("vaultbaltop").setExecutor(new CommandToTest());
        getCommand("vb").setExecutor(new CommandToTest());*/
    }

    @Override
    public void onDisable() {
    }

    private boolean setupEconomy() {
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        economy = rsp.getProvider();
        return economy != null;
    }

    public static Economy getEconomy() {
        return economy;
    }
}
