//package space.gavinklfong.demo.streamapi.models;
//
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//import lombok.With;
//
//@Builder
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table
public class Product {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String category;
	
//	@With
	private Double price;
	
//	@ManyToMany(mappedBy = "products")
//	@ToString.Exclude
//	@EqualsAndHashCode.Exclude
	private Set<Order> orders;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
}
