package lfc.pojo;

import lfc.mapper.ProductMapper;
import lfc.pojo.base.BasePOJO;

import java.math.BigDecimal;
import java.util.Date;

public class Product extends BasePOJO implements lfc.pojo.ORM.POJOMapper<ProductMapper> {

    private String name;
    private String subTitle;
    private BigDecimal originalPrice;
    private BigDecimal nowPrice;
    private Integer stock;
    private Integer imgid;
    private Date createDate;
    private Integer commentCount;
    private Integer saleCount;
    private String summary;
    private String pic;
    private String imageURL;
    private String file;
    private String detail;
    private String isSold = "false";

    public String getIsSold() {
        return isSold;
    }

    public void setIsSold(String isSold) {
        this.isSold = isSold;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.subTitle
     *
     * @return the value of product.subTitle
     *
     * @mbg.generated
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.subTitle
     *
     * @param subTitle the value for product.subTitle
     *
     * @mbg.generated
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.originalPrice
     *
     * @return the value of product.originalPrice
     *
     * @mbg.generated
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.originalPrice
     *
     * @param originalPrice the value for product.originalPrice
     *
     * @mbg.generated
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.nowPrice
     *
     * @return the value of product.nowPrice
     *
     * @mbg.generated
     */
    public BigDecimal getNowPrice() {
        return nowPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.nowPrice
     *
     * @param nowPrice the value for product.nowPrice
     *
     * @mbg.generated
     */
    public void setNowPrice(BigDecimal nowPrice) {
        this.nowPrice = nowPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.stock
     *
     * @return the value of product.stock
     *
     * @mbg.generated
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.stock
     *
     * @param stock the value for product.stock
     *
     * @mbg.generated
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.imgid
     *
     * @return the value of product.imgid
     *
     * @mbg.generated
     */
    public Integer getImgid() {
        return imgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.imgid
     *
     * @param imgid the value for product.imgid
     *
     * @mbg.generated
     */
    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.createDate
     *
     * @return the value of product.createDate
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.createDate
     *
     * @param createDate the value for product.createDate
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.commentCount
     *
     * @return the value of product.commentCount
     *
     * @mbg.generated
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.commentCount
     *
     * @param commentCount the value for product.commentCount
     *
     * @mbg.generated
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.saleCount
     *
     * @return the value of product.saleCount
     *
     * @mbg.generated
     */
    public Integer getSaleCount() {
        return saleCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.saleCount
     *
     * @param saleCount the value for product.saleCount
     *
     * @mbg.generated
     */
    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }
}