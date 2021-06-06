package me.tinyoverflow.papi.skriptlang;

import ch.njol.skript.Skript;
import ch.njol.skript.variables.Variables;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SkriptLangExpansion extends PlaceholderExpansion {

    private Skript plugin;

    @Override
    public boolean canRegister() {
        return (plugin = (Skript) Bukkit.getPluginManager().getPlugin(getRequiredPlugin())) != null;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "skript";
    }

    @Override
    public @NotNull String getAuthor() {
        return "tinyoverflow";
    }

    @Override
    public @Nullable String getRequiredPlugin() {
        return "Skript";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(Player player, @NotNull String identifier) {
        String variable = (player == null) ? identifier.toLowerCase() : identifier.toLowerCase()
                .replace("{player}", player.getName())
                .replace("{uuid}", player.getUniqueId().toString());

        Object value = Variables.getVariable(variable, null, false);
        return value == null ? null : String.valueOf(value);
    }
}
