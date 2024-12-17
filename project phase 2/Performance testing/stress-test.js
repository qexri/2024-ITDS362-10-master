import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
  stages: [
    { duration: '2m', target: 50 },  // Ramp up to 50 users
    { duration: '3m', target: 100 }, // Ramp up to 100 users
    { duration: '2m', target: 200 }, // Ramp up to 200 users
    { duration: '1m', target: 0 },   // Ramp down to 0 users
  ],
  insecureSkipTLSVerify: true,
};

export default function () {
  const res = http.get('https://45.136.236.146/');
  check(res, {
    'status is 200': (r) => r.status === 200,
  });
  sleep(1);
}
