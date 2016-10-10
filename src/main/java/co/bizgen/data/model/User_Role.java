package CO.BIZGEN.data.model;

public class User_Role {
	private Long id;
	
	private Long idUser;
	private Long idRole;
	public User_Role(){
		
	}
	public User_Role(Long idUser, Long idRole){
		this.idUser=idUser;
		this.idRole=idRole;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
