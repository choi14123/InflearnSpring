package hello.upload.domain;


import lombok.Data;

import java.util.List;

@Data
public class Item {
    private Long itemId;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;

    public void setId(long id) {
        this.itemId = id;
    }

    public long getId() {
        return itemId;
    }
}