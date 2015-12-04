package org.lab.rm.engine.model.pj;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity("pjContext")
public class PjContext {

	@Id
	private ObjectId id;

	@Reference
	private Pj actor;

	private Inventory inventory;

	private Integer currentHitPoints;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Pj getActor() {
		return actor;
	}

	public void setActor(Pj actor) {
		this.actor = actor;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Integer getCurrentHitPoints() {
		return currentHitPoints;
	}

	public void setCurrentHitPoints(Integer currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

}