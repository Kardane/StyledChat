package eu.pb4.styledchat.config.data;


public class ChatStyleData {
    public static ChatStyleData DEFAULT = getDefault();

    public String displayName;
    public String chat;
    public String join;
    public String joinRenamed;
    public String joinFirstTime;
    public String left;
    public String death;
    public String advancementTask;
    public String advancementChallenge;
    public String advancementGoal;


    private static ChatStyleData getDefault() {
        ChatStyleData data = new ChatStyleData();
        data.displayName = "${vanillaDisplayName}";
        data.chat = "<${player}> ${message}";
        data.join = "<yellow><lang:multiplayer.player.joined:'${player}'></yellow>";
        data.joinRenamed = "<yellow><lang:multiplayer.player.joined.renamed:'${player}':'${old_name}'></yellow>";
        data.joinFirstTime = "<yellow><lang:multiplayer.player.joined:'${player}'></yellow>";
        data.left = "<yellow><lang:multiplayer.player.left:'${player}'></yellow>";
        data.death = "${default_message}";
        data.advancementTask = "<lang:chat.type.advancement.task:'${player}':'${advancement}'>";
        data.advancementGoal = "<lang:chat.type.advancement.goal:'${player}':'${advancement}'>";
        data.advancementChallenge = "<lang:chat.type.advancement.challenge:'${player}':'${advancement}'>";

        return data;
    }
}
