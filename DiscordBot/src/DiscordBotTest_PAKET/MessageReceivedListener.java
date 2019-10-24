package DiscordBotTest_PAKET;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageReceivedListener extends ListenerAdapter {
	
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            String content = event.getMessage().getContentRaw();
            
            if (content.equals(">test")) {
                event.getChannel().sendMessage("Ich bin bereit Ihnen zu Dienen!").queue();
            }
            else if (content.charAt(0)=='>'&&content.contains("bester") && content.contains("Philosoph")) {
                event.getChannel().sendMessage("Munshi ist der beste Philosoph auf dem Server!").queue();
            }
            else if (content.toLowerCase().contains("fehler des bots") || content.toLowerCase().contains("fehler vom bot")
            		|| content.toLowerCase().contains("bot macht fehler") || content.toLowerCase().contains("fehlerbot")) {
                event.getChannel().sendMessage("Menschen begehen Fehler. Ich nicht!").queue();
            }
        }
    }

}
