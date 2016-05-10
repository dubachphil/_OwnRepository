package ch.dubach.mongo;

import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public class Database extends DatabaseConnection {

	public WriteResult insertDocument(BasicDBObject document) {
		if (null == collection || null == document) {
			return null;
		}
		return collection.insert(document);

	}

	public DBCursor readDocuments() {
		if (null == collection) {
			return null;
		}
		DBCursor docs = collection.find();
		return docs;
	}
	
	public WriteResult removeDocument(BasicDBObject document) {
		if (null == collection || null == document) {
			return null;
		}
		return collection.remove(document);
		
	}
	public void dropCollection() {
		collection.drop();
		
	}
	
	public void insertDocuments(List<BasicDBObject> documents) {
		for (DBObject dbObject : documents) {
			collection.insert(dbObject);
		}
	}

	
	
	
	
	
//	public WriteResult updateData(BasicDBObject changedDoc, DBObject currentDoc, Boolean isOverwrite) {
//		if (null == collection || null == currentDoc) {
//			return null;
//		}
//		BasicDBObject temp = new BasicDBObject();
//		if (isOverwrite) {
//			temp = changedDoc;
//		} else {
//			temp.put("$set", changedDoc);
//		}
//		return collection.update(currentDoc, temp);
//	}
//
//	public DBCursor searchData(BasicDBObject searchQuery) {
//		if (null == searchQuery) {
//			return null;
//		}
//		return collection.find(searchQuery);
//	}

}
