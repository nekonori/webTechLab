<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register Employee</title>
  </head>
  <body>
    <h1>Employee Registration</h1>
    <form method="POST" action="Register">
      <div>
        <label>Employee no.</label>
        <input name="empNo" required />
      </div>
      <div>
        <label>Name</label>
        <input name="name" required />
      </div>
      <div>
        <label>Email</label>
        <input name="email" required />
      </div>
      <div>
        <label>Mobile no.</label>
        <input name="mobile" required />
      </div>
      <div>
        <label>Department</label>
        <input name="department" required />
      </div>
      <div>
        <label>Designation</label>
        <input name="designation" required />
      </div>
      <div>
        <label>Location</label>
        <input name="location" required />
      </div>
      <button>Register</button>
    </form>
  </body>
</html>
