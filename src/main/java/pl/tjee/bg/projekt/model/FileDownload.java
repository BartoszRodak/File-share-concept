/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tjee.bg.projekt.model;

import java.io.Serializable;

/**
 *
 * @author Bartem
 */
public class FileDownload implements Serializable {

    String name;
    String type;
    byte[] data;

    public FileDownload(String name, String type, byte[] data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }

    public FileDownload(File file) {
        this.name = file.getName();
        this.type = file.getType();
        this.data = file.getContent();
    }

    public FileDownload() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}
