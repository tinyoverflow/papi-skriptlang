# papi-skriptlang
This project is an expansion plugin for the [PlaceholderAPI](https://github.com/placeholderapi/placeholderapi) project.
It provides a dynamic placeholder to allow the use of variables defined in [Skript](https://github.com/skriptlang/skript)
in every plugin which supports PlaceholderAPI.

---

## Installation
You currently have to install this expansion by hand.
1. [Download the latest release](https://github.com/tinyoverflow/papi-skriptlang/releases).
2. Upload it to `/plugins/PlaceholderAPI/expansions/` on your server.
3. Reload PlaceholderAPI with `/papi reload` or restart your server.

---

## Usage

### Available Placeholders
#### %skript_\<skript variable name\>%
Replace `<skript variable name>` with the name of your script variable. For example: `%skript_economy::{uuid}%`.
This placeholder supports using variables.

### Available Variables
The placeholder also supports using variables for context specific Skript variables.

#### {player}
This replaces {player} with the actual Minecraft name of the player in context. This is *not* the display name.

#### {uuid}
This replaces {uuid} with the UUID name of the player in context.