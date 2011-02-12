/**
 * GamingServiceBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.definitions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.jdo.JDOObjectNotFoundException;

import org.apache.axis.types.NormalizedString;

import be.tbs.mgf.database.DataStoreConnection;
import be.tbs.mgf.database.apache.ApacheDataStoreConnection;
import be.tbs.mgf.database.apache.data.PlayerData;
import be.tbs.mgf.error.VersionException;
import be.tbs.mgf.games.ReservedWords;
import be.tbs.mgf.games.player.Player;
import be.tbs.mgf.games.player.RosterException;
import be.tbs.mgf.games.session.status.StatusUpdate;
import be.tbs.mgf.synchronization.PingPongManager;
import be.tbs.mgf.synchronization.SynchronizationException;
import be.tbs.www.mgf.schemas.Error;
import be.tbs.www.mgf.schemas.JoinReply;
import be.tbs.www.mgf.schemas.LeaveReply;
import be.tbs.www.mgf.schemas.Message;
import be.tbs.www.mgf.schemas.Ping;
import be.tbs.www.mgf.schemas.PlayerDescriptor;
import be.tbs.www.mgf.schemas.Pong;
import be.tbs.www.mgf.schemas.StatusProperty;
import be.tbs.www.mgf.schemas.StatusReply;

/**
 * Endpoint for the gaming service.
 * Implemented using Axis Stubs
 * @author Philip De Smedt & Gino Wuytjens
 */
public class GamingServiceBindingImpl implements be.tbs.www.mgf.definitions.GamingService_PortType{
    
	private static int fVersion = 1;
	
	private static Logger fLog = Logger.getLogger(GamingServiceBindingImpl.class.getName());
	
	private DataStoreConnection fDBC = new ApacheDataStoreConnection();
	
	/**
	 * Check the version compatibility of both parties.
	 * @param request
	 * @param reply
	 * @throws VersionException 
	 * @throws VersionException
	 */
	public void checkVersion(Message request, Message reply) throws VersionException {
		reply.setVersion(fVersion);
		if (request.getVersion() != fVersion) {
			throw new VersionException(request.getVersion(), fVersion);
		}
	}
	
	public be.tbs.www.mgf.schemas.JoinReply joinOperation(be.tbs.www.mgf.schemas.JoinRequest request) throws java.rmi.RemoteException {
//		long b4 = Calendar.getInstance().getTimeInMillis();
//		JoinReply reply = new JoinReply();
//		
//		// --1-- Version control
//		try {
//			checkVersion(request, reply);
//		} catch (VersionException e) {
//			Pong pong = PingPongManager.generatePong(request.getPing());
//			reply.setPong(pong);
//			Error error = new Error();
//			error.setCode(e.getErrorCode());
//			error.setDescription(e.getDescription());
//			reply.setError(error);
//			return reply;
//		}
//		
//		// --1b-- Check for capacity
//		List<PlayerData> players = (List<PlayerData>) fDBC.getAll(PlayerData.class.getName());
//		if (players.size() >= getCapacity()) {
//			Pong pong = PingPongManager.generatePong(request.getPing());
//			reply.setPong(pong);
//			Error error = new Error();
//			error.setCode(820);
//			error.setDescription("Server is full");
//			reply.setError(error);
//			return reply;
//		}
//		
//		// --2-- Authenticate Player
////		Error authError = Authenticator.authenticate(request.getPlayer());
////		if (authError != null) {
////			Pong authPong = PingPongManager.generatePong(request.getPing());
////			reply.setPong(authPong);
////			reply.setError(authError);
////			return reply;
////		}
//		
//		// --3-- Create Player
//		Player player;
//		try {
//			player = new Player(request.getPlayer().getPlayerName().toString(), request.getPing().getTimeStamp().getTime());
//		} catch (RosterException e) {
//			Pong pong = PingPongManager.generatePong(request.getPing());
//			reply.setPong(pong);
//			Error error = new Error();
//			error.setCode(e.getErrorCode());
//			error.setDescription(e.getDescription());
//			reply.setError(error);
//			return reply;
//		}
//		PlayerDescriptor playerDesc = new PlayerDescriptor();
//		playerDesc.setPlayerID(player.getId());
//		reply.setPlayer(playerDesc);
//		
//		// --4-- Synchronization
//		Pong pong = PingPongManager.pingUnchecked(player, request.getPing());
//		reply.setPong(pong);
//		
//		// --5-- Save a status update for this event.
//		StatusUpdate su = new StatusUpdate(player.getId(), player.getLastStamp(), "player-join", player.getName());
//		
//		// --6-- Done
//	
//		long ms = Calendar.getInstance().getTimeInMillis() - b4;
//		System.out.println("TimeStamp - JOIN: " + ms);
//		return reply;
    	long b4 = Calendar.getInstance().getTimeInMillis();
		Ping p = request.getPing();
		p = new Ping();
		p.setTimeStamp(Calendar.getInstance());
		
		JoinReply reply = new JoinReply();
		
		// --1-- Version control
		try {
			checkVersion(request, reply);
		} catch (VersionException e) {
			Pong pong = PingPongManager.generatePong(p);
			reply.setPong(pong);
			Error error = new Error();
			error.setCode(e.getErrorCode());
			error.setDescription(e.getDescription());
			reply.setError(error);
			return reply;
		}
		
		// --1b-- Check for capacity
		List<PlayerData> players = (List<PlayerData>) fDBC.getAll(PlayerData.class.getName());
		if (players.size() >= getCapacity()) {
			Pong pong = PingPongManager.generatePong(p);
			reply.setPong(pong);
			Error error = new Error();
			error.setCode(820);
			error.setDescription("Server is full");
			reply.setError(error);
			return reply;
		}
		
		// --3-- Create Player
		Player player;
		try {
			player = new Player(request.getPlayer().getPlayerName().toString(), p.getTimeStamp().getTime());
		} catch (RosterException e) {
			Pong pong = PingPongManager.generatePong(p);
			reply.setPong(pong);
			Error error = new Error();
			error.setCode(e.getErrorCode());
			error.setDescription(e.getDescription());
			reply.setError(error);
			return reply;
		}
		PlayerDescriptor playerDesc = new PlayerDescriptor();
		playerDesc.setPlayerID(player.getId());
		reply.setPlayer(playerDesc);
		
		// --4-- Synchronization
		Pong pong = PingPongManager.pingUnchecked(player, p);
		reply.setPong(pong);
		
		// --5-- Save a status update for this event.
		StatusUpdate su = new StatusUpdate(player.getId(), player.getLastStamp(), "player-join", player.getName());
		
		// --6-- Done
		
		long ms = Calendar.getInstance().getTimeInMillis() - b4;
		System.out.println("TimeStamp - JOIN: " + ms);
		return reply;
    }

    public be.tbs.www.mgf.schemas.StatusReply statusOperation(be.tbs.www.mgf.schemas.StatusRequest request) throws java.rmi.RemoteException {
//    	long b4 = Calendar.getInstance().getTimeInMillis();
//    	StatusReply reply = new StatusReply();
//    	
//		// --1-- Version control
//		try {
//			checkVersion(request, reply);
//		} catch (VersionException e) {
//			Pong pong = PingPongManager.generatePong(request.getPing());
//			reply.setPong(pong);
//			Error error = new Error();
//			error.setCode(e.getErrorCode());
//			error.setDescription(e.getDescription());
//			reply.setError(error);
//			return reply;
//		}
//		
//		// --2-- Get the player
//		// TODO : Check if this player has joined already, maybe through authenticator
//		Player player = new Player((be.tbs.mgf.database.data.PlayerData) fDBC.getObjectByID(PlayerData.class, request.getPlayer().getPlayerID()+""));
//		Date previous_timestamp = player.getLastStamp();
//		
//		// --3-- Ping pong
//		try {
//			Pong pong = PingPongManager.ping(player, request.getPing());
//			reply.setPong(pong);
//		} catch (SynchronizationException e) {
//			Pong pong = PingPongManager.generatePong(request.getPing());
//			reply.setPong(pong);
//			Error error = new Error();
//			error.setCode(e.getErrorCode());
//			error.setDescription(e.getDescription());
//			reply.setError(error);
//			return reply;
//		}
//		
//		// --4-- Get statuses needed for this player
//		StatusProperty[] replySP = reply.getProperty();
//		List<StatusProperty> replySPs = new ArrayList<StatusProperty>();
//		for (int i = 0; i < replySP.length; i++) {
//			if (replySP[i] != null) {
//				replySPs.add(replySP[i]);
//			}
//		}
//		List<StatusUpdate> statuses = StatusUpdate.getAllSince(previous_timestamp);
//		for (StatusUpdate statusUpdate : statuses) {
//			StatusProperty sp = new StatusProperty();
//			NormalizedString property = new NormalizedString();
//			property.setValue(statusUpdate.getProperty());
//			sp.setName(property);
//			
//			NormalizedString value = new NormalizedString();
//			value.setValue(statusUpdate.getValue());
//			sp.setValue(value);
//			sp.setPlayer(statusUpdate.getPlayer());
//			replySPs.add(sp);
//		}
//		
//		// --5-- Apply the status in the request / TODO : check if this is allowed?
//		StatusProperty sp = request.getProperty();
//		if ((sp.getName() == null) || (sp.getValue() == null)) {
//			String name = "";
//			String value = "";
//			if (sp.getName() != null) {
//				name = sp.getName().toString();
//			} 
//			if (sp.getValue() != null) {
//				value = sp.getValue().toString();
//			}
//			StatusUpdate su = new StatusUpdate(player.getId(),player.getLastStamp(), name, value);
//		}
//		
//		long ms = Calendar.getInstance().getTimeInMillis() - b4;
//		System.out.println("TimeStamp - STATUS: " + ms);
//		return reply;
    	long b4 = Calendar.getInstance().getTimeInMillis();
		Ping p = request.getPing();
		p = new Ping();
		p.setTimeStamp(Calendar.getInstance());
		
		StatusReply reply = new StatusReply();
		
		// --1-- Version control
		try {
			checkVersion(request, reply);
		} catch (VersionException e) {
			Pong pong = PingPongManager.generatePong(p);
			reply.setPong(pong);
			Error error = new Error();
			error.setCode(e.getErrorCode());
			error.setDescription(e.getDescription());
			reply.setError(error);
			return reply;
		}
		
		// --2-- Get the player
		// TODO : Check if this player has joined already, maybe through authenticator
		Player player;
		try {
			player = new Player((be.tbs.mgf.database.data.PlayerData) fDBC.getObjectByID(PlayerData.class, request.getPlayer().getPlayerID()+""));
		} catch (JDOObjectNotFoundException e) {
			Pong pong = PingPongManager.generatePong(p);
			reply.setPong(pong);
			Error error = new Error();
			error.setCode(810);
			error.setDescription("Player ID is invalid");
			reply.setError(error);
			return reply;
		}
		Date previous_timestamp = player.getLastStamp();

		// --3-- Ping pong
		try {
			Pong pong = PingPongManager.ping(player, p);
			reply.setPong(pong);
		} catch (SynchronizationException e) {
			fLog.warning("Player " + player.getId() + " encountered a synchronization exception.");
			Pong pong = PingPongManager.generatePong(p);
			reply.setPong(pong);
			Error error = new Error();
			error.setCode(e.getErrorCode());
			error.setDescription(e.getDescription());
			reply.setError(error);
			return reply;
		}
		
		StatusProperty[] replySP = reply.getProperty();
		List<StatusProperty> replySPs = new ArrayList<StatusProperty>();
		for (int i = 0; i < replySP.length; i++) {
			if (replySP[i] != null) {
				replySPs.add(replySP[i]);
			}
		}
		StatusProperty st = request.getProperty();
		if (st.getName().toString().equalsIgnoreCase(ReservedWords.STATUS_REQUEST_UPDATES)) {

			// --4-- Get statuses needed for this player
			List<StatusUpdate> statuses = StatusUpdate.getAllSince(previous_timestamp);
			System.out.println("There are " + statuses.size() + " new status since your last update.");
			for (StatusUpdate statusUpdate : statuses) {
				StatusProperty sp = new StatusProperty();
				sp.setName(new NormalizedString(statusUpdate.getProperty()));
				sp.setValue(new NormalizedString(statusUpdate.getValue()));
				sp.setPlayer(statusUpdate.getPlayer());
				replySPs.add(sp);
			}
			
		} else if (st.getName().toString().equalsIgnoreCase(ReservedWords.STATUS_REQUEST_PLAYERS)) {
			List<PlayerData> players = (List<PlayerData>) fDBC.getAll(PlayerData.class.getName());
			for (PlayerData playerData : players) {
				StatusProperty sp = new StatusProperty();
				sp.setName(new NormalizedString("player"));
				sp.setValue(new NormalizedString(playerData.getName()));
				sp.setPlayer(playerData.getId());
				replySPs.add(sp);
			}
		} else {
			// --5-- Apply the status in the request / TODO : check if this is allowed?
			if ((st.getName() == null) || (st.getValue() == null)) {
				String name = "";
				String value = "";
				if (st.getName() != null) {
					name = st.getName().toString();
				} 
				if (st.getValue() != null) {
					value = st.getValue().toString();
				}
				StatusUpdate su = new StatusUpdate(player.getId(),player.getLastStamp(), name, value);
			} else {
				StatusUpdate su = new StatusUpdate(player.getId(),player.getLastStamp(), st.getName().toString(), st.getValue().toString());
			}
		}
		
		int index = 0;
		for (int i = 0; i < replySP.length; i++) {
			if (replySP[i] == null) {
				index = i;
				break;
			}
		}
		
		for (StatusProperty s : replySPs) {
			reply.getProperty()[index++] = s;
		}
		
		long ms = Calendar.getInstance().getTimeInMillis() - b4;
		System.out.println("TimeStamp - STATUS: " + ms);
		return reply;
    }

    public be.tbs.www.mgf.schemas.LeaveReply leaveOperation(be.tbs.www.mgf.schemas.LeaveRequest request) throws java.rmi.RemoteException {
//    	long b4 = Calendar.getInstance().getTimeInMillis();
//    	LeaveReply reply = new LeaveReply();
//		
//		// --1-- Version control
//		try {
//			checkVersion(request, reply);
//		} catch (VersionException e) {
//			Pong pong = PingPongManager.generatePong(request.getPing());
//			reply.setPong(pong);
//			Error error = new Error();
//			error.setCode(e.getErrorCode());
//			error.setDescription(e.getDescription());
//			reply.setError(error);
//			return reply;
//		}
//		
//		// --2-- Check if specified player exists
//		List<PlayerData> player = (List<PlayerData>) fDBC.getAll(PlayerData.class.getName(), "playerId", ""+request.getPlayer().getPlayerID());
//		
//		if (player.size() != 1) {
//			fLog.warning("While executing a leave operation, found " + player.size() + " players matching the leaving player " + request.getPlayer().getPlayerID());
//			Pong pong = PingPongManager.generatePong(request.getPing());
//			reply.setPong(pong);
//			Error error = new Error();
//			error.setCode(910);
//			error.setDescription("No single record of this player could be found");
//			reply.setError(error);
//			return reply;
//		}
//		
//		// --3-- Delete specified player
//		PlayerData pd = player.get(0);
//		Player p = new Player(pd);
//		reply.setPong(PingPongManager.pingUnchecked(p, request.getPing()));
//		reply.setPlayerID(p.getId());
//		fDBC.delete(pd);
//		
//		// --4-- Save a status update for this event.
//		StatusUpdate su = new StatusUpdate(p.getId(), p.getLastStamp(), "player-leave", p.getName());
//		long ms = Calendar.getInstance().getTimeInMillis() - b4;
//		System.out.println("TimeStamp - LEAVE: " + ms);
//		return reply;
    	long b4 = Calendar.getInstance().getTimeInMillis();
		Ping p = request.getPing();
		p = new Ping();
		p.setTimeStamp(Calendar.getInstance());
		
		LeaveReply reply = new LeaveReply();
		
		// --1-- Version control
		try {
			checkVersion(request, reply);
		} catch (VersionException e) {
			Pong pong = PingPongManager.generatePong(p);
			reply.setPong(pong);
			Error error = new Error();
			error.setCode(e.getErrorCode());
			error.setDescription(e.getDescription());
			reply.setError(error);
			return reply;
		}
		
		// --2-- Check if specified player exists
		List<PlayerData> player = (List<PlayerData>) fDBC.getAll(PlayerData.class.getName(), "playerId", ""+request.getPlayer().getPlayerID());
		
		if (player.size() != 1) {
			fLog.warning("While executing a leave operation, found " + player.size() + " players matching the leaving player " + request.getPlayer().getPlayerID());
			Pong pong = PingPongManager.generatePong(p);
			reply.setPong(pong);
			Error error = new Error();
			error.setCode(910);
			error.setDescription("No single record of this player could be found");
			reply.setError(error);
			return reply;
		}
		
		// --3-- Delete specified player
		PlayerData pd = player.get(0);
		Player pl = new Player(pd);
		reply.setPong(PingPongManager.pingUnchecked(pl, p));
		reply.setPlayerID(pl.getId());
		fDBC.delete(pd);
		
		// --4-- Save a status update for this event.
		StatusUpdate su = new StatusUpdate(pl.getId(), pl.getLastStamp(), "player-leave", pl.getName());
		long ms = Calendar.getInstance().getTimeInMillis() - b4;
		System.out.println("TimeStamp - LEAVE: " + ms);
		return reply;
    }
    
    /**
	 * Gets this server's capacity for players.
	 * @return int - The maximum number of players allowed on this server.
	 */
	public int getCapacity() {
		return 4;
	}

}
