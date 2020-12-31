package me.dkim19375.vaultbaltop;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandToTest implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
/*        if (args.length < 1) return false;
        VaultBaltopAPI api = BaltopAPIProvider.getAPI();
        switch (args[0].toLowerCase()) {
            case "baltop":
                sender.sendMessage("Baltop: " + api.getBaltop());
                return true;
            case "ranking":
                sender.sendMessage("Ranking: " + api.getPlayer(Integer.parseInt(args[1])));
                return true;
            case "balance":
                if (args.length == 2) {
                    Double d = api.getBalance(PlayerUtils.getFromAll(args[1]));
                    if (d == null) {
                        sender.sendMessage("NULL");
                        return false;
                    }
                    sender.sendMessage("Balance: " + d);
                    return true;
                }
                Double d = api.getBalance(((Player) sender).getUniqueId());
                if (d == null) {
                    sender.sendMessage("NULL");
                    return false;
                }
                sender.sendMessage("Balance: " + d);
                return true;
            case "offlineplayers":
                sender.sendMessage("OfflinePlayers: " + Arrays.toString(Bukkit.getOfflinePlayers()));
                return true;
            case "default":
                return false;
        }*/
        return false;
    }
}
