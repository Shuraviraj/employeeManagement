import React from "react";

const Employee = ({ employee }) => {
  return (
    <tr key={employee.email}>
      <td className="text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm to-gray-500">{employee.firstName}</div>
      </td>
      <td className="text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm to-gray-500">{employee.lastName}</div>
      </td>
      <td className="text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm to-gray-500">{employee.email}</div>
      </td>
      <td className="text-right px-6 py-4 whitespace-nowrap font-medium text-sm">
        <a href="#" className="text-indigo-600 hover:text-amber-800 px-4">
          Edit
        </a>
        <a href="#" className="text-indigo-600 hover:text-amber-800">
          Delete
        </a>
      </td>
    </tr>
  );
};

export default Employee;
