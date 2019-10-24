package DiscordBotTest_PAKET;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class TestYAHUDI_BOT {
	
	public static JDA jda;
	
	public static void main(String[]args) throws LoginException {
		
		jda = new JDABuilder(AccountType.BOT).setToken("NjM2Mjc2MzAyMDEzMzk5MDYw.Xa9SZw.LYXOrkkHJWTX-G_BDUFZUvrilXk").build();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setActivity(Activity.watching("Philosophie!"));
		jda.addEventListener(new MessageReceivedListener());
	
		System.out.println(jda.getUserById("190445036272353280"));
	}
	

}
