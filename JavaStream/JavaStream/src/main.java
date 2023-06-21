

class Main {
    public static void main(String[] args) {

        List<Customer> customers =new List<Customer>;
        List<Order> orders =new List<Order>;
        List<Product> products =new List<Product>;

        List<Products> Ex1= products.stream().filter(p->p.getCategory()=="Books").filter(p->p.getPrice()>100)
                .collect(Collectors.toList());

        List<Order> Ex2=orders.stream().filter(o->o.getProducts().stream().anyMatch(p -> p.getCategory()=="Baby"))
                .collect(Collectors.toList());

        List<Products> Ex3=products.stream().filter(p->p.getCategory()=="Toys").map(p->p.setPrice(p.getPrice)*0.9)
                .collect(Collectors.toList());

        List<Product> Ex4= orders.stream().filter(o->o.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)))
                .filter(o->o.getOrderDate().isBefore(LocalDate.of(2021, 4, 1)))
                .flatMap(o -> o.getProducts().stream())
                .collect(Collectors.toList());

        Product Ex5 = products.stream().filter(p->p.getCategory()=="Books").min(Comparator.comparing(Product::getPrice));

        List<Order> Ex6= orders.stream().sorted(Comparator.comparing(Order::getOrderDate)).limit(3)
                .collect(Collectors.toList());

        List<Poduct> Ex7= orders.stream().filter(o->o.getOrderDate().equals(LocalDate.of(2021, 3, 15))
                .peek(o -> System.out.println(o.toString()))
                .flatMap(o -> o.getProducts().stream())
                .collect(Collectors.toList());

       Double Ex8= orders.stream().filter(o->o.getOrderDate().getMonth()=="FEBRUARY")
               .filter(o->o.getOrderDate().getYear==2021)
               .flatMap(o -> o.getProducts().stream())
               .mapToDouble(p -> p.getPrice()).sum();

       double Ex9 = orders.stream().filter(o->o.getOrderDate().equals(LocalDate.of(2021, 3, 15)))
               .flatMap(o -> o.getProducts().stream())
               .mapToDouble(p -> p.getPrice())
               .average()

        DoubleSummaryStatistics statistics = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(p -> p.getPrice())
                .summaryStatistics();

        Map<Long, Integer> Ex11=ordders.stream().collect(
                Collectors.toMap(
                        order -> order.getId(),
                        order -> order.getProducts().size()
                )
    }
}
