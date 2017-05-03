package com.datascience.springboot.util;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.awt.List;
import java.net.UnknownHostException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.datascience.springboot.model.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

@Service("database")
public class DatabaseImpl implements Database {

	@SuppressWarnings("finally")
	public DB getConnection() {
		MongoClient mongoClient;
		DB db = null;
		try {
			mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
			db = mongoClient.getDB("dataScience");
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			return db;
		}

	}

	public void saveData(User user) {
		DB database = getConnection();
		DBCollection table = database.getCollection("user");
		int uId = table.find().count() + 1;
		BasicDBObject document = new BasicDBObject();
		document.put("uId", uId);
		document.put("fName", user.getfName());
		document.put("lName", user.getlName());
		document.put("eMail", user.geteMail());
		document.put("phoneNo", user.getPhoneNo());
		document.put("password", user.getPassword());
		table.insert(document);

	}

	public boolean checkUserExists(String uName, String password) {
		DB database = getConnection();
		DBCollection collection = database.getCollection("user");
		BasicDBObject andQuery = new BasicDBObject();
		ArrayList<BasicDBObject> obj = new ArrayList<BasicDBObject>();
		obj.add(new BasicDBObject("eMail", uName));
		obj.add(new BasicDBObject("password", password));
		andQuery.put("$and", obj);

		/* query used */
		System.out.println(andQuery.toString());
		DBCursor cursor = collection.find(andQuery);
		if (cursor.hasNext()) {
			System.out.println(cursor.next().containsField("uId"));
			return true;

		}
		return false;
	}

}
