package me.dkim19375.vaultbaltop;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandToTest implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
 /*       if (args.length < 1) return false;
        VaultBaltopAPI api = BaltopAPIProvider.getAPI();
        switch (args[0].toLowerCase()) {
            case "getplayer":
                sender.sendMessage("Ranking: " + api.getPlayer(Integer.parseInt(args[1])));
                return true;
            case "baltop":
                case "uuid": sender.sendMessage("Baltop: " + api.getBaltop());
                return true;
            case "getuuidlb":
                sender.sendMessage("UUID ranking: " + Arrays.toString(api.getUUIDLeaderboard()));
                return true;
            case "getplayerlb":
                sender.sendMessage("Player ranking: " + Arrays.toString(api.getPlayerLeaderboard()));
                return true;
            case "getbalancelb":
                sender.sendMessage("Balance ranking: " + Arrays.toString(api.getBalanceLeaderboard()));
                return true;
            case "default":
                sender.sendMessage("Invalid argument");
                return false;
        }
        sender.sendMessage("error");*/
        return false;
    }
}