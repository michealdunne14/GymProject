package code;

import java.util.ArrayList;
import java.util.Scanner;

public class Assessment {
	private double chest;
	private double upperArm;
	private double thigh;
	private double hip; 
	private double waist;
	private double weight;
	private String comment;
	private Trainer trainer;	
	
	public Assessment(double chest,double upperArm,double thigh,double hip,double waist,double weight,String comment,Trainer trainer){
		this.setChest(chest);
		this.setUpperArm(upperArm);
		this.setThigh(thigh);
		this.setHip(hip);
		this.setWaist(waist);
		this.setWeight(weight);
		this.setComment(comment);
		this.setTrainer(trainer);
	}

	/**
	 * @return the chest
	 */
	public double getChest() {
		return chest;
	}

	/**
	 * @param chest the chest to set
	 */
	public void setChest(double chest) {
		this.chest = chest;
	}

	/**
	 * @return the upperArm
	 */
	public double getUpperArm() {
		return upperArm;
	}

	/**
	 * @param upperArm the upperArm to set
	 */
	public void setUpperArm(double upperArm) {
		this.upperArm = upperArm;
	}

	/**
	 * @return the thigh
	 */
	public double getThigh() {
		return thigh;
	}

	/**
	 * @param thigh the thigh to set
	 */
	public void setThigh(double thigh) {
		this.thigh = thigh;
	}

	/**
	 * @return the hip
	 */
	public double getHip() {
		return hip;
	}

	/**
	 * @param hip the hip to set
	 */
	public void setHip(double hip) {
		this.hip = hip;
	}

	/**
	 * @return the waist
	 */
	public double getWaist() {
		return waist;
	}

	/**
	 * @param waist the waist to set
	 */
	public void setWaist(double waist) {
		this.waist = waist;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the trainer
	 */
	public Trainer getTrainer() {
		return trainer;
	}

	/**
	 * @param trainer the trainer to set
	 */
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
}
