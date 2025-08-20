package com.elu.fruitsemailservice.dto;

public class FruitsDto {

    /**
     * The fruit id.
     */
    private Integer id;

    /**
     * The fruit name.
     */
    private String name;

    /**
     * The fruit description.
     */
    private String description;

    /**
     * The available quantity.
     */
    private Integer quantity;

    /**
     * The price of the fruit.
     */
    private Double price;

    /**
     * The user email.
     */
    private String email;

    /**
     * The user name.
     */
    private String userName;

    /**
     * The user mobile number.
     */
    private String mobileNumber;

    /**
     * Default constructor.
     */
    public FruitsDto() {
    }

//    /**
//     * Constructor with all fields.
//     *
//     * @param idParam           the fruit id
//     * @param nameParam         the fruit name
//     * @param descriptionParam  the description
//     * @param quantityParam     the quantity
//     * @param priceParam        the price
//     * @param emailParam        the email
//     * @param userNameParam     the username
//     * @param mobileNumberParam the mobile number
//     */
//    @SuppressWarnings("checkstyle:ParameterNumber")
//    public FruitsDto(final Integer idParam,
//                     final String nameParam,
//                     final String descriptionParam,
//                     final Integer quantityParam,
//                     final Double priceParam,
//                     final String emailParam,
//                     final String userNameParam,
//                     final String mobileNumberParam) {
//        this.id = idParam;
//        this.name = nameParam;
//        this.description = descriptionParam;
//        this.quantity = quantityParam;
//        this.price = priceParam;
//        this.email = emailParam;
//        this.userName = userNameParam;
//        this.mobileNumber = mobileNumberParam;
//    }

    /**
     * Gets the fruit id.
     *
     * @return the fruit id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the fruit id.
     *
     * @param idParam the fruit id
     */
    public void setId(final Integer idParam) {
        this.id = idParam;
    }

    /**
     * Gets the fruit name.
     *
     * @return the fruit name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the fruit name.
     *
     * @param nameParam the fruit name
     */
    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    /**
     * Gets the fruit description.
     *
     * @return the fruit description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the fruit description.
     *
     * @param descriptionParam the fruit description
     */
    public void setDescription(final String descriptionParam) {
        this.description = descriptionParam;
    }

    /**
     * Gets the fruit quantity.
     *
     * @return the fruit quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the fruit quantity.
     *
     * @param quantityParam the fruit quantity
     */
    public void setQuantity(final Integer quantityParam) {
        this.quantity = quantityParam;
    }

    /**
     * Gets the fruit price.
     *
     * @return the fruit price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the fruit price.
     *
     * @param priceParam the fruit price
     */
    public void setPrice(final Double priceParam) {
        this.price = priceParam;
    }

    /**
     * Gets the user email.
     *
     * @return the user email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user email.
     *
     * @param emailParam the user email
     */
    public void setEmail(final String emailParam) {
        this.email = emailParam;
    }

    /**
     * Gets the username.
     *
     * @return the username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the username.
     *
     * @param userNameParam the username
     */
    public void setUserName(final String userNameParam) {
        this.userName = userNameParam;
    }

    /**
     * Gets the user mobile number.
     *
     * @return the user mobile number
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the user mobile number.
     *
     * @param mobileNumberParam the user mobile number
     */
    public void setMobileNumber(final String mobileNumberParam) {
        this.mobileNumber = mobileNumberParam;
    }


    /**
     * Returns a string representation of the fruit DTO.
     *
     * @return string containing field values
     */
    @Override
    public String toString() {
        return "FruitsDto{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", description='" + description + '\''
                + ", quantity=" + quantity
                + ", price=" + price
                + ", email='" + email + '\''
                + ", userName='" + userName + '\''
                + ", mobileNumber='" + mobileNumber + '\''
                + '}';
    }

}
