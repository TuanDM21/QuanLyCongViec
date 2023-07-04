<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../Common/header2.jsp" />
                <!-- Begin Page Content -->
                <div class="container-fluid">
                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Contract</h1>
                    <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below.
                        For more information about DataTables, please visit the <a target="_blank"
                            href="https://datatables.net">official DataTables documentation</a>.</p>
                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
                            
                        </div>
                    <form action = "all-contract"
	                    class="d-none d-sm-inline-block form-inline mr-auto my-2 my-md-0 mw-100 navbar-search pt-1">
	                    <div class="input-group">
	                        <input name ="search" type="text" class="form-control bg-white border border-dark" placeholder="Nhập mã hợp đồng"
	                            aria-label="Search" aria-describedby="basic-addon2">
	                        <div class="input-group-append">
	                            <button class="btn btn-primary" type="submit">
	                                <i class="fas fa-search fa-sm"></i>
	                            </button>
	                        </div>
	                    </div>
                    </form>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
									      <th>#</th>
									      <th>Mã hợp đồng</th>
									      <th>Name</th>
									      <th>Employee</th>
									      <th>Thời hạn</th>
									      <th>Ngày ký</th>
									      <th></th>
									    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listContract}" var="c">
											<tr>
												<td scope="row">${c.ID}</td>
												<td>${c.IDContract}</td>
												<td>${c.name}</td>
												<td>${c.nameEmployee}</td>
												<td>${c.thoiHan}</td>
												<td>${c.ngayKy}</td>
												<td>
													<a href="${pageContext.request.contextPath}/edit-contract?
													ID=${c.ID}" type="button" class="btn btn-primary">Edit</a>
												</td>
											</tr>
										</c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->
<jsp:include page="../Common/footer.jsp" />
            